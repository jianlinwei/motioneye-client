/*
 * Copyright (c) 2019. MotionEye Client by Developer From Jokela, All Rights Reserved.
 * Licenced with MIT:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *  and associated documentation files (the "Software"), to deal in the Software without restriction,including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *   The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *    SOFTWARE.
 */

package com.developerfromjokela.motioneyeclient.classes.disks;

import java.io.Serializable;
import java.util.List;

public class Disk implements Serializable {
    private String bus;
    private String model;
    private String vendor;
    private String target;
    private List<Partition> partitions;

    public Disk(String bus, String model, String vendor, String target, List<Partition> partitions) {
        this.bus = bus;
        this.model = model;
        this.target = target;
        this.vendor = vendor;
        this.partitions = partitions;
    }

    public List<Partition> getPartitions() {
        return partitions;
    }

    public String getBus() {
        return bus;
    }

    public String getModel() {
        return model;
    }

    public String getTarget() {
        return target;
    }

    public String getVendor() {
        return vendor;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
