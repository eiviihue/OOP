Ringkasan Isi

Berdasarkan nama dan konteks (Clock.md dalam folder OOP), kemungkinan besar file ini menjelaskan tentang kelas (class) Clock dalam paradigma Object Oriented Programming. Biasanya meliputi:

gambaran umum fungsi kelas Clock

atribut (properties) yang dimiliki, seperti jam, menit, detik

method (fungsi/metode) apa saja yang tersedia, seperti:

setTime(...)

tick() atau nextSecond()

toString() atau display()

aturan validasi waktu (misalnya menit < 60, detik < 60, jam dalam format 0-23 atau 1-12 tergantung sistem)

contoh penggunaan kelas: membuat objek Clock, mengubah waktu, mencetak waktu

Penjelasan Tambahan

Berikut beberapa aspek yang bisa diperjelas atau ditambahkan dalam dokumentasi agar lebih baik:

Bagian	Penjelasan / Saran Tambahan
Format Waktu	Perjelas apakah jam menggunakan format 24-jam atau 12-jam; jika ada AM/PM jika pakai 12-jam.
Validasi	Sebutkan bagaimana jika nilai yang diberikan tidak valid (misalnya menit 75, detik -5): apakah dilempar error/exception, dibulatkan, atau diabaikan.
Tick / Pergerakan Waktu	Jelaskan metode yang menaikkan satuan waktu (detik → menit → jam), dan apa yang terjadi kalau lewat batas (misalnya detik dari 59 ke 0 → menit bertambah).
Pengaturan Zona Waktu (Opsional)	Jika dikembangkan, bisa tambah dukungan zona waktu, standar UTC vs lokal, sinkronisasi waktu, dst.
Immutability vs Mutability	Apakah objek Clock bisa diubah (setTime, tick) atau setelah dibuat tetap (immutable)? Itu berdampak bagaimana pengguna memakai kelas.
Representasi String	Bagaimana format toString atau metode serupa: “HH:MM:SS”, apakah ada leading zero (05:03:09 vs 5:3:9); apakah ada label AM/PM.
Edge Cases	Contoh kasus-kasus batas, misalnya: waktu 23:59:59 + satu detik → 00:00:00. Juga apa yang terjadi jika dipasang waktu dengan input invalid.
Penggunaan Example / Demo	Bagian contoh kode pemakaian bisa ditampilkan: membuat objek, merubah waktu, memanggil tick, menampilkan waktu. Memudahkan pemahaman.
Keamaan & Error Handling	Bagaimana kelas ini menangani input yang salah, apakah ada pengecekan dan exception, atau hanya print pesan error, atau ignore.

Source code:

NumberDisplay.java
```

public class NumberDisplay {

    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }

    public void increment() {
        value = (value + 1) % limit;
    }
}

```

ClockDisplay.java
```

public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String DisplayString;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);

        updateDisplay();
    }

    public ClockDisplay(int hour, int minute, int second) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);

        setTime(hour, minute, second);

        updateDisplay();
    }

    public void timeTick() {
        seconds.increment();
        if (seconds.getValue() == 0) {
            minutes.increment();
            if (minutes.getValue() == 0) {
                hours.increment();
            }
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute, int second) {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    public String getTime() {
        return DisplayString;
    }

    public void updateDisplay() {
        DisplayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }
}

```

Clock.java
```

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Clock {

    private JFrame frame;
    private JLabel label;
    private ClockDisplay clock;
    private boolean clockRunning = false;
    private TimerThread timerThread;

    public Clock() {
        makeFrame();
        clock = new ClockDisplay();
    }

    private void start() {
        clockRunning = true;
        timerThread = new TimerThread();
        timerThread.start();
    }

    private void stop() {
        clockRunning = false;
    }

    private void step() {
        clock.timeTick();;
        label.setText(clock.getTime());
    }

    private void showAbout() {
        JOptionPane.showMessageDialog(frame, "Clock Mark I\n" + "A simple interface for the 'Object First' clock display project", "About Clock", JOptionPane.INFORMATION_MESSAGE);
    }

    private void quit() {
        System.exit(0);
    }

    private void makeFrame() {
        frame = new JFrame("Clock");
        JPanel contentPane = (JPanel) frame.getContentPane();
        contentPane.setBorder(new EmptyBorder(1, 60, 1, 60));

        makeMenuBar(frame);

        contentPane.setLayout(new BorderLayout(12, 12));

        label = new JLabel("00:00:00", SwingConstants.CENTER);
        Font displayFont = label.getFont().deriveFont(96.0f);
        label.setFont(displayFont);
        contentPane.add(label, BorderLayout.CENTER);

        JPanel toolbar = new JPanel();
        toolbar.setLayout(new GridLayout(1, 0));

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> start());

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(e -> stop());
        toolbar.add(stopButton);

        JButton stepButton = new JButton("Step");
        stepButton.addActionListener(e -> step());
        toolbar.add(stepButton);

        toolbar.add(startButton);

        JPanel flow = new JPanel();
        flow.add(toolbar);

        contentPane.add(flow, BorderLayout.SOUTH);

        frame.pack();

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(d.width / 2 - frame.getWidth() / 2, d.height / 2 - frame.getHeight() / 2);
        frame.setVisible(true);
    }

    private void makeMenuBar(JFrame frame) {
        final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx();

        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu menu;

        JMenuItem item;

        menu = new JMenu("File");
        menubar.add(menu);

        item = new JMenuItem("About Clock...");
        item.addActionListener(e -> showAbout());
        menu.add(item);

        menu.addSeparator();

        item = new JMenuItem("Quit");
        item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
        item.addActionListener(e -> quit());
        menu.add(item);
    }

    class TimerThread extends Thread {

        public void run() {
            while (clockRunning) {
                step();
                pause();
            }
        }

        private void pause() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
            }
        }
    }

}
```
Output

https://github.com/user-attachments/assets/f3907722-3835-498e-8072-d2cf4db674f3

