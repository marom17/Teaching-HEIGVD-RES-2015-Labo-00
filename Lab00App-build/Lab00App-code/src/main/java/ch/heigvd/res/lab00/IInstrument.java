/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Marom
 */
public class IInstrument {
    IInstrument(){
        
    }
    
    IInstrument(int vol,String sound,String color){
        this.sound=sound;
        this.color=color;
        volume=vol;
    }
    
    protected int volume;
    protected String color;
    protected String sound;
    
    public String play(){
    return sound;
}
    public int getSoundVolume(){
        return volume;
    }
    public String getColor(){
        return color;
    }
}

class Trumpet extends IInstrument{
    Trumpet(){
        super(10,"pouet","golden");

    }
}

class Flute extends IInstrument{
    Flute(){
        super(5,"","");
    }
}