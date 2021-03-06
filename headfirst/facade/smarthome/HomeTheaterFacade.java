package headfirst.facade.smarthome;


public class HomeTheaterFacade { 
  private Amplifier amp; 
  private Tuner tuner; 
  private DvdPlayer dvd; 
  private CdPlayer cd; 
  private Projector projector; 
  private Light light; 
  private Screen screen; 
  private Cellphone cellphone; 
  private Computer computer; 
   
  public HomeTheaterFacade(Amplifier amp,  Tuner tuner,DvdPlayer dvd, CdPlayer cd,  Projector projector, Screen screen, Light light, Cellphone cellphone, Computer computer) { 
   
   this.amp = amp; 
   this.tuner = tuner; 
   this.dvd = dvd; 
   this.cd = cd; 
   this.projector = projector; 
   this.screen = screen; 
   this.light = light; 
   this.cellphone = cellphone; 
   this.computer=computer; 
  } 
   
  public void watchMovie(String movie) { 
   System.out.println("Ready to watch a movie"); 
   cellphone.off(); 
   cellphone.showTime(); 
   computer.off(); 
   light.dim(10); 
   screen.down(); 
   projector.on(); 
   projector.wideScreenMode(); 
   amp.on(); 
   amp.setDvd(dvd); 
   amp.setSurroundSound(); 
   amp.setVolume(5); 
   dvd.on(); 
   dvd.play(movie); 
  } 
   
   
  public void endMovie() { 
   System.out.println("turn off movie play"); 
   cellphone.on(); 
   cellphone.showTime(); 
   computer.on(); 
   computer.systemBooting("Window 10 boot"); 
   light.on(); 
   screen.up(); 
   projector.off(); 
   amp.off(); 
   dvd.stop(); 
   dvd.eject(); 
   dvd.off(); 
  } 
 
  public void listenToCd(String cdTitle) { 
   System.out.println("Ready for CD"); 
   light.on(); 
   cellphone.off(); 
   cellphone.showTime(); 
   computer.off(); 
   amp.on(); 
   amp.setVolume(5); 
   amp.setCd(cd); 
   amp.setStereoSound(); 
   cd.on(); 
   cd.play(cdTitle); 
  } 
 
  public void endCd() { 
   System.out.println("Turn off  CD"); 
   amp.off(); 
   amp.setCd(cd); 
   cd.eject(); 
   cd.off(); 
  } 
 
  public void listenToRadio(double frequency) { 
   System.out.println("Turn on"); 
   tuner.on(); 
   tuner.setFrequency(frequency); 
   amp.on(); 
   amp.setVolume(5); 
   amp.setTuner(tuner); 
  } 
 
  public void endRadio() { 
   System.out.println("turn off"); 
   tuner.off(); 
   amp.off(); 
  } 
   
  public void beginStudy(){ 
   System.out.println("Start Study mode"); 
   cellphone.showTime(); 
   cellphone.off(); 
   computer.off(); 
   light.off(); 
   cd.off(); 
  } 
   
  public void endStudy(){ 
   System.out.println("End Study mode"); 
   cellphone.on(); 
   cellphone.showAfterTime(); 
   computer.on(); 
   computer.systemBooting("Window 10 boot"); 
   light.on(); 
   cd.on(); 
   cd.play("Let's play!"); 
  } 
   
 } 
