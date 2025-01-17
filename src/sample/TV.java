package sample;

public class TV {

    int channel;

    void chengeChannel(int channel){
        if(channel<=0||13<=channel){
            System.out.println("チャンネルは1～12までの間で設定してください");
            return;
        }

        this.channel=channel;
        System.out.println(this.channel+"チャンネルに切り替えました");
    }

}
