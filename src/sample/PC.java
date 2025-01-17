package sample;

public class PC implements Electrical{
    //元TV

    private boolean powerOn;
    private int channel;

    @Override
    public void power(){
        if(powerOn){
            System.out.println("PCの電源が切れました");
            powerOn=false;
        }else{
            System.out.println("設定ファイルを読み込んでいます");
            powerOn=true;
            System.out.println("PCの電源が入りました");
        }
    }

    /* 
    public void changeChannel(int channel){
        if(!powerOn){
            System.out.println("テレビの電源を入れてください");
            return;

        }

        this.channel=channel;
        System.out.println(this.channel+"チャンネルに切り替わりました");

    }*/

}
