package OOPs.baitap2;

import java.util.Scanner;

public class Time {
   private int Hour;
   private int Minute;
   private int Second;
   void inputTime(){
       Scanner input = new Scanner(System.in);
       System.out.println("Input hour: " + Hour);
       Hour = input.nextInt();
       System.out.println("Input minute: " + Minute);
       Minute = input.nextInt();
       System.out.println("Input second: " + Second);
       Second = input.nextInt();
   }

   //Hàm khởi tạo k đối số
    public Time(){
        this.Hour = 0;
        this.Minute = 0;
        this.Second = 0;
    }
    //Hàm khởi tạo có đối số
    public Time(int hour, int minute, int second){
        this.Hour = hour;
        this.Minute = minute;
        this.Second = second;
    }
    public int getHour () {
        return Hour;
    }
    public void setHour(int hour){
        if ( hour >= 0 && hour < 24){
            this.Hour = hour;
        } else {
            this.Hour = 0;
        }
    }

    public int getMinute() {
        return Minute;
    }

    public void setMinute(int minute) {
        if (minute >=0 && minute < 60){
            this.Minute = minute;
        } else {
            this.Minute = 0;
        }
    }

    public int getSecond() {
        return Second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60){
            this.Second = second;
        } else {
            this.Second = second;
        }
    }
    @Override
    public String toString(){     // sử dụng String leading zero
        String str ="";
        if(Hour == 12 || Hour == 0){
            str += 12 + ":";
        }else{
            str += (Hour % 12) + ":";
        }
        if (Minute < 10){
            str += "0";
        } else {
            str +="";
        }
        str += Minute + ":";
        if (Second < 10){
            str += "0";
        }else {
            str +="";
        }
        str += Second;
        if(Hour < 12){
            str += "AM";
        }else {
            str += "PM";
        }
        return str;
    }


    // Tăng gờ lên 1 đơn vị nếu 24h sẽ reset về 0
    public void tangHour(){
       setHour(Hour +1);
    }
    public void tangMinute(){
        this.setMinute(Minute +1);
        if (this.Minute == 0){
            tangHour();
        }
    }
    public void tangSecond(){
        this.setSecond(Second + 1);
        if(Second == 0){
            tangMinute();
        }
    }

}
