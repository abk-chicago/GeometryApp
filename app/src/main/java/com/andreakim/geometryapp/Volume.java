package com.andreakim.geometryapp;

/**
 * Created by andreakim on 6/27/16.
 */
public class Volume {

        public int length, breadth, height;
        public int volumeBox;

        public Volume(int length, int breadth, int height, int volumeBox) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
            this.volumeBox = volumeBox;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getBreadth() {
            return breadth;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }
