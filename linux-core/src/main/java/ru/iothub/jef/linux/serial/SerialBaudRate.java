/*
 * Copyright (c) 2021, IOT-Hub.RU and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is dual-licensed: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License Version 3 as
 * published by the Free Software Foundation. For the terms of this
 * license, see <http://www.gnu.org/licenses/>.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public
 * License Version 3 for more details (a copy is included in the LICENSE
 * file that accompanied this code).
 *
 * You should have received a copy of the GNU Affero General Public License
 * version 3 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact support@iot-hub.ru or visit www.iot-hub.ru if you need
 * additional information or have any questions.
 *
 * You can be released from the requirements of the license by purchasing
 * a Java Embedded Framework Commercial License. Buying such a license is
 * mandatory as soon as you develop commercial activities involving the
 * Java Embedded Framework software without disclosing the source code of
 * your own applications.
 *
 * Please contact sales@iot-hub.ru if you have any question.
 */

package ru.iothub.jef.linux.serial;

public enum SerialBaudRate {
    B0(0),         /* hang up */
    B50(1),
    B75(2),
    B110(3),
    B134(4),
    B150(5),
    B200(6),
    B300(7),
    B600(10),
    B1200(11),
    B1800(12),
    B2400(13),
    B4800(14),
    B9600(15),
    B19200(16),
    B38400(17),
    B57600(10001),
    B115200(10002),
    B230400(10003),
    B460800(10004),
    B500000(10005),
    B576000(10006),
    B921600(10007),
    B1000000(10010),
    B1152000(10011),
    B1500000(10012),
    B2000000(10013),
    B2500000(10014),
    B3000000(10015),
    B3500000(10016),
    B4000000(10017);

    final int value;

    SerialBaudRate(int value) {
        this.value = value;
    }
}
