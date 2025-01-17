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

package ru.iothub.jef.mcu.core.boards.opi;

import ru.iothub.jef.mcu.core.boards.BoardPin;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://download.kamami.pl/p573812-orangepi%203_user%20manual_v1.0.pdf
public class OrangePi3Board extends OrangePiAbstractBoard {
    public OrangePi3Board() throws IOException {
    }

    @Override
    protected List<BoardPin> initGPIO() throws IOException {
        BoardPin[] pins2x13 = {
                new BoardPin(1, "3.3v", null),
                new BoardPin(2, "5V", null),
                new BoardPin(3, "PD26", getBoardPin('D', 26)), // TWI0-SDA
                new BoardPin(4, "5V", null),
                new BoardPin(5, "PD26", getBoardPin('D', 25)), // 	TWI0-SCK
                new BoardPin(6, "Ground", null),
                new BoardPin(7, "PD22", getBoardPin('D', 22)),
                new BoardPin(8, "PL02", getBoardPin('L', 2)), // S-UART-TX
                new BoardPin(9, "Ground", null),
                new BoardPin(10, "PL03", getBoardPin('L', 3)),  // S-UART-RX

                new BoardPin(11, "PD24", getBoardPin('D', 24)), // UART3-RX
                new BoardPin(12, "PD18", getBoardPin('D', 18)),
                new BoardPin(13, "PD23", getBoardPin('D', 23)), // UART3-TX
                new BoardPin(14, "Ground", null),
                new BoardPin(15, "PL10", getBoardPin('L', 10)),
                new BoardPin(16, "PD15", getBoardPin('D', 15)),
                new BoardPin(17, "3.3v", null),
                new BoardPin(18, "PD16", getBoardPin('D', 16)),
                new BoardPin(19, "PH05", getBoardPin('H', 5)),  // SPI1-MOSI
                new BoardPin(20, "Ground", null),
                new BoardPin(21, "PH06", getBoardPin('H', 6)),  // SPI1-MISO
                new BoardPin(22, "PD21", getBoardPin('D', 21)),
                new BoardPin(23, "PH04", getBoardPin('H', 4)), // SPI1-SCK
                new BoardPin(24, "PH03", getBoardPin('H', 3)), // SPI1-CS
                new BoardPin(25, "Ground", null),
                new BoardPin(26, "PL08", getBoardPin('L', 8)),
        };

        return Collections.unmodifiableList(Arrays.asList(pins2x13));
    }
}
