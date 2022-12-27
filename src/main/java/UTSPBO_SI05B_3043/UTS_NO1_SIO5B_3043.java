
package UTSPBO_SI05B_3043;

public class UTS_NO1_SIO5B_3043 {
//Class
    public class Rectangle {
        //Atribut
        private float length, width;
        
        //Konstraktor
        public Rectangle() {
            setLength((float) 1);
            setWidth((float) 1);
        }
         //Parameter
        public Rectangle(float l, float w) {
            setLength(l);
            setWidth(w);
        }
            //Metode
        public float getLength() {
            return length;
        }
            //Metode
        public float getWidth() {
            return width;
        }
            //Metode
        public void setLength(float l) {
            length = l;
            if (l < 0.0 || l > 20.0) {
                length = (float) 0.0;
            }
        }
            
        public void setWidth(float w) {
            width = w;
            if (w < 0.0 || w > 20.0) {
                width = (float) 0.0;
            }
        }

        public float area() {
            return length * width;
        }

        public boolean square() {
            return length == width;
        }
    }
}
