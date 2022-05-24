package _4_Class_and_Object.practice.p1;

public class rectangle {
    double width,height;
    public rectangle (){}
        public rectangle(double width,double height){
            this.width = width;
            this.height=height;
        }
        public double getArea(){
        return this.height*this.width;
        }
        public double getPerimeter(){
        return (this.height+this.width)*2;
        }
        public String display(){
        return  "rectangle{"+"width="+width+" height="+height+"}";
        }

}
