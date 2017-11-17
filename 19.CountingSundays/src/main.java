public class main{
    public static void main(String[] args){
        String day="monday";
        int date=1;
        int sunday=0;
        int month=1;
        int year;
        int x=1;//day of week as number
        String[] dayname=new String[7];
        dayname[0]="sunday";
        dayname[1]="monday";
        dayname[2]="tuesday";
        dayname[3]="wednesday";
        dayname[4]="thursday";
        dayname[5]="friday";
        dayname[6]="saturday";
        for (year=1901;year<=2000;year++){
            while (month<=12){
                if (month==4||month==6||month==9||month==11){//30 date months
                    date+=30;
                    x+=(date%7)-1;
                    if (x>=7){
                        x-=7;
                    }
                    if (dayname[x]=="sunday"){
                        sunday++;
                    }
                    date=1;
                }
                else if (month==2){//february
                    if (year%4==0&&year%400==0){//if leap year
                        date+=29;
                        x+=(date%7)-1;
                        if (x>=7){
                            x-=7;
                        }
                        if (dayname[x]=="sunday"){
                            sunday++;
                        }
                        date=1;
                    }
                    else{//if regular year
                        date+=28;
                        x+=(date%7)-1;
                        if (x>=7){
                            x-=7;
                        }
                        if (dayname[x]=="sunday"){
                            sunday++;
                        }
                        date=1;
                    }
                }
                else{//months with 31 days
                    date+=31;
                    x+=(date%7)-1;
                    if (x>=7){
                        x-=7;
                    }
                    if (dayname[x]=="sunday"){
                        sunday++;
                    }
                    date=1;
                }
                month++;
            }
            month=1;
        }
        System.out.println("Number of sundays: "+sunday);
    }
}