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

package ru.iothub.jef.mcu.core.boards.rpi;

import ru.iothub.jef.linux.i2c.I2CBus;
import ru.iothub.jef.linux.spi.SpiBus;
import ru.iothub.jef.mcu.core.boards.Board;
import ru.iothub.jef.mcu.core.boards.BoardPin;

import java.io.IOException;
import java.util.List;

abstract class RaspberryPiAbstractBoard extends Board {
    private List<SpiBus> spis;
    private List<I2CBus> i2cs;
    private List<BoardPin> pins;
    private RpiBoardInfo info;

    public RaspberryPiAbstractBoard()  throws IOException {
        setSpi(initSPI());
        setI2cs(initI2C());
        setPins(initGPIO());
    }

    protected abstract List<BoardPin> initGPIO() throws IOException;

    protected abstract List<I2CBus> initI2C() throws IOException;

    protected abstract List<SpiBus> initSPI() throws IOException;

    protected void setSpi(List<SpiBus> buses) {
        this.spis = buses;
    }

    protected void setI2cs(List<I2CBus> buses) {
        this.i2cs = buses;
    }

    protected void setPins(List<BoardPin> pins) {
        this.pins = pins;
    }

    @Override
    public int getPinCount() {
        return pins.size();
    }

    @Override
    public BoardPin getPin(int index) {
        return pins.get(index - 1);
    }

    @Override
    public List<BoardPin> getPins() {
        return pins;
    }

    @Override
    public List<SpiBus> getSpiBuses() {
        return spis;
    }

    @Override
    public List<I2CBus> getI2CBuses() {
        return i2cs;
    }

    public void setBoardInfo(RpiBoardInfo info) {
        this.info = info;
    }

    @Override
    public String getBoardInfo() {
        return "Raspberry Pi " + info.getModel() + " " + info.getRevision() + " " + info.getRam();
    }
}
