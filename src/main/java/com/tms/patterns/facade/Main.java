package com.tms.patterns.facade;

public class Main {
    public static void main(String[] args) {
        //Читать информацию из DVD

        //Power - ON OF
        //DVD-ROM - open close
        //Disk - перенос

        Power power = new Power();
        DvdRom dvdRom = new DvdRom();
        DvdDecoder dvdDecoder = new DvdDecoder();

        power.on();
        dvdRom.open();
        dvdRom.close();
        dvdDecoder.copy();
        power.off();

        //Через фасад
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.copyFromDVDtoComputer();

        computerFacade.power.on();
        computerFacade.dvdRom.open();
        computerFacade.dvdRom.close();
        computerFacade.dvdDecoder.copy();
        computerFacade.power.off();
    }
}
