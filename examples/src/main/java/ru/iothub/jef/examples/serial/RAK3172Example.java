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

package ru.iothub.jef.examples.serial;

import ru.iothub.jef.devices.library.rakwireless.rak3172.LoRaWANDeviceConfiguration;
import ru.iothub.jef.devices.library.rakwireless.rak3172.RAK3172;
import ru.iothub.jef.devices.library.rakwireless.rak3172.Rak3172ATCommands;
import ru.iothub.jef.examples.Example;
import ru.iothub.jef.linux.core.NativeIOException;
import ru.iothub.jef.linux.core.Sys;
import ru.iothub.jef.linux.serial.SerialBaudRate;
import ru.iothub.jef.linux.serial.SerialPort;

import java.io.IOException;

public class RAK3172Example extends RAK3172ExampleBaseline {
    @Override
    public String getName() {
        return "RAK3172 communication";
    }

    @Override
    public void init() throws Exception {

    }

    @Override
    public SerialPort getSerial() throws NativeIOException {
        return new SerialPort("/dev/ttyDUMMY", SerialBaudRate.B9600);
    }



    @Override
    public void showIntro() {

    }
}
