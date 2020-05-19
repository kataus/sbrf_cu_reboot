package ru.itvitality.sbrf.cu.j2003.l15.logging.ex04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
yum install rsyslog

vi /etc/rsyslog.conf
ModLoad imudp
UDPServerRun 514

systemctl enable rsyslog
systemctl start rsyslog

tail -f /var/log/messages
*/

public class LoggerSyslogExample {
    private static Logger logger = LoggerFactory.getLogger(LoggerSyslogExample.class);
    private long counter = 0;

    public static void main(String[] args) {
        new LoggerSyslogExample().loop();
    }

    public void loop() {
        while (true) {
            logger.error("msg for Syslog:{}", counter);
            counter++;
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
