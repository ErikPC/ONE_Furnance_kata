package edu.poniperro.otherstuff;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.RoomTemperature;

public class Pirate implements Heater {

    public Pirate() {
    }

    @Override
    public void on(RoomTemperature habitacion) {
        double temperatura = 1 + habitacion.getTemperatura();
        habitacion.setTemperatura(temperatura);
    }

    @Override
    public void off(RoomTemperature habitacion) {
        double temperatura = 1 - habitacion.getTemperatura();
        habitacion.setTemperatura(temperatura);

    };

    public void speak() {
        System.out.println("\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@##Oo*o@OoO##@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@OO@#    O.   O@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@##*  °Oo   °   **.O@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@##*    °       .   ###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#°            °O#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@O. .. ..  °O@@@##@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@####°oo*o*oo #@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#°.*°***°*.°O##Oo###@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@###Oo°o*°***°*o*°°°..°###@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@O°.°..°***°..°°°°°°o##@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@###o*.   °°***°..°°..**#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@#@#oo°  °*°°°**°**oo  ***O#@#@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@##***   oOooo..OOOOo  *°°o###@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@##o.°*   °OO#O  oOOO.  °o*#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@#@@o*OO    .**.   °°    °#oo#@@#@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@#@@#ooOOO                 °OOOoO#@##@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@##@#OoOOOOO.                °OOo*ooO@@#@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@#@@OooOO*oOO..°            . .Oo*° ooo#@@#@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@##@@#ooOOo .*oO..*            ° .OOOO °#ooO#@@#@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@#@@#OoOOOO. O#OO .o°°         *°  *OO° °OOOooO#@@#@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@#@#OoOOOOOO. .oo° .OO*°.  . .°°*o°     .oOOOOOooO#@##@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@#@@O°*OOOOOOO*      oOOOOo*°*°**oOOOo*°°oOOOOOOOOOooO@@#@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@#@#o*°°oOOOOOOOo*°°*OOOOOo*°°°°°*OOOOOOOOOOOOOOOOOoOOoo#@#@@@@@@@@@@@@\n" +
                "@@@@@@@@@#@#oo#*.°OOOOOOOOOOOOOOOOOO°.°°.°oOOOOOOOOOOOOOOOo**°oo°°O@#@@@@@@@@@@@\n" +
                "@@@@@@@@#@OoOooO°.*OOOOOOOOOOOOOOOOO..°..°OOOOOOOOOOOOOOOOo°°*°*...o@##@@@@@@@@@\n" +
                "@@@@@@@#@o.**°°oO°°oOOOOOOOOOOOOOOOO*°°°*oOOOOOOOOOOOOOOOOOoOo°o.°°°*@@#@@@@@@@@\n" +
                "@@@@@##@*..**o*OO*.°OOOOOOOOOOOOOOOOO°°°oOOOOOOOOOOOOOOOOOOOOO.oo.*°.*#@#@@@@@@@\n" +
                "@@@@@##*°°°o°OOOOO*.°OOOOOOOOOOOOOOOo°°°°OOOOOOOOOOOOOOOOOOOOOo.oO*°°.*###@@@@@@\n" +
                "@@@@#@o.°°oo°OOOOOO°°*OOOOOOOOOOOOOO*°°°°oOOOOOOOOOOOOOOOOOOOOOo**ooOo.*@#@@@@@@\n" +
                "@@@#@O.*°*o°oOOOOOOO°°*OOOOOOOOOOOOO°°°°°*OOOOOOOOOOOOOOOOOOOOOOOOo*o**oo@#@@@@@\n" +
                "@@###*oOo*°*oOOOOOOOo°°*OOOOOOOOOOOo.°°°°.oOOOOOOOOOOOOOOOOOOOOOooo°°oOO*O@#@@@@\n" +
                "@@#@o.O**oO*OOOOOOOOOO°.*OOOOOOOOOOo*OoOoOoOOOOOOOOOOOOOOOOOOOOOO**ooOOOO*@#@@@@\n" +
                "@#@#*****O*oOOOOOOOOOOO°.*OOOOOOOOooo#ooooooOOOOOOOOOOOOOOOOOOOOOo.oOOOOOoO@#@@@\n" +
                "@#@oOOO°*o°OOOOOOOOOOOOO*.°OOOOOOOooo#oO#o#oOOOOOOOOOOOOOOOOOOOOOo°*oOOOOO*##@@@\n" +
                "#@#oOOOOO°°OOOOOOOOOOOOOOo.°oOOOOOoOoOooo*o*oOOOOOOOOOOOOOOooOOOO°°oooOOOOoO@#@@\n" +
                "#@OoOOOOo°*oOOOOOOOOOOOOOOo.°oOOo*°°°°°°°°°°°*oOOOOOOOOOOO*OooOOoo**#*OOOOOo##@@\n" +
                "@#oOOOOO°*OoooOoOooOOOOOOOOO°.°***°°°°°°°°°°°*****ooOOOOOOOOOOooOOo°#ooOOOO*#@#@\n" +
                "@#oOOOOO°OOOOooooOOOOOOOoo***°.°oOo°°°°°°°°°*OOOooo********oooOOOOo°O#*OOOO*O@#@\n" +
                "@OoOOOO*°OOOOOOOooooo*****ooOOo°.°OO°°°°°.°oOOOOOOOOOOOOOOOOOOOOOOO°o@*OOOOoO@#@\n" +
                "@OoOOOO**OOOOOOOOOOOOOOOOOOOOOOO*..*Oo°°.*oOOOOOOOOOOOOOOOOOOOOOOOO°*#ooOOOoo@#@\n" +
                "@ooOOOOooOOOOOOOOOOOOOOOOOOOOOOOOo°.°oO**OOOOOOOOOOOOOOOOOOOOOOOOOO**@ooOOOoo@#@\n" +
                "@oOOOOoooOOOOOOOOOOOOOOOOOOOOOOOOOO*°.*OOOOOOOOOOOOOOOOOOOOOOOOOOOO**@OoOOOoo@#@\n" +
                "@oOOOOoooOOOOOOOOOOOOOOOOOOOOOOOOOOOo°..*OOOOOOOOOOOOOOOOOOOOOOOOOO**@O*OOOoo@#@\n" +
                "@oOOOOoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo°.°oOOOOOOOOOOOOOOOOOOOOOOOO**@#*OOOoO@#@\n" +
                "@ooOOOoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*°.°oOOOOOOOOOOOOOOOOOOOOOO°*@#*OOOoO@#@\n" +
                "@OoOOOo#oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*°.*oOOOOOOOOOOOOOOOOOOOO°o@#*OOOo#@#@\n" +
                "@OoOOOo#ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*..*oOOOOOOOOOOOOOOOOOo°O@O*OOO*#@#@\n" +
                "##oOOOoOO*OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo*°.*oOOOOOOOOOOOOOOOo°O@OoOOO*#@@@\n" +
                "#@oOOOoO#*OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*°.*oOOOOOOOOOOOOOo°#@OoOOoo@#@@\n" +
                "#@OoOOOo@ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*°.°ooOOo*O**o**°*@@ooOOoO@#@@\n" +
                "#@#*OOO*##*OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo°.°°o°.°°°.°..o@#oOOO*#@#@@\n" +
                "##@ooOOoO@OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*°°°.°°.°.°°.o@OoOOoo@#@@@\n" +
                "@#@#*OOoo@@ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo**°°.......*@*OOO*###@@@\n" +
                "@@#@ooOO*###ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo°........ oOoOOoo@#@@@@\n" +
                "@@###*OOoo@@#*oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo° °° °.°°.*oOOO*##@@@@@\n" +
                "@@@#@#oOOoO###ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO*° ....oOOOOOOOo#@#@@@@@\n" +
                "@@@@#@OoOOOOooOo°ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOooo**°.°°.**ooOOOOo#@#@@@@@@\n" +
                "@@@@###oOOOoooo#O*°***oooOOOOOOOOOOOOOOOOOOOOoooo***°°°°*°°°°.*##oOOOOo##@@@@@@@\n" +
                "@@@@#@#oOOOo##°o@O°*°°°°°°*****oooooooo******°°°°°°**oooo*°°*.o#Oo*Oooo@#@@@@@@@\n" +
                "@@@@#@Oooooo#@*O#*.*oOOOoo*****°°*°°°°°°°°°°°°**oOOOOoo*°*°°oo°*ooooo*o#@#@@@@@@\n" +
                "@@@@#@O**o*oO@@@#***.***oOoOOOOO*o°***°°*°°°*°*o*o°**.*o°°**°oo.*o****O##@@@@@@@\n" +
                "@@@@#@#**o*o*O@#ooo°**.*o*.**°°o°*.....°..... ..*o°**°°oo°°**°o*°o*oO#@@@@@@@@@@\n" +
                "@@@@@@@#oOo####ooo°**°ooo°***°oo     °.*.°°.    *oo°**°ooo.***°O°*@@@@#@@@@@@@@@\n" +
                "@@@@@@@@@@@@@#*oo°**°*oo*°**°oo*°*°°°°*****°°°*°°oo****°oo*.**°**°####@@@@@@@@@@\n" +
                "@@@@@@@#####@ooo°°**°oo*°**°*oo.°o*°*. .*. .*°**.*oo°**°°oo°.*°.oO##@@@@@@@@@@@@\n" +
                "@@@@@@@@@@#@#**.°**°*o*.***°oo°.°**°°°.°°°°°°°°...*o°°*°°oo°°#oO#@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@#@#o.°°°°°oo.°**°*o°...°*. ******° °°° ..o*°*°*o#O#@@@##@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@O#O*Oo*.°**°.*o°...°°°.******°°°°. °o###oOOoo@@###@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@#@@#ooOOo**##Oo#Oo°..   . .°   .°°**#@#@@#oOO*o@#@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@###@OoOOoo@@@@@@@###Oo*°°..°*O#@@@@@#@##@OoOO*###@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@#@#oOOo#######@@@@@@@@@@@@@@@####@@@@#@Ooooo@##@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@#@#oOoO@#@@@@##############@@@@@@@@@@#@#OooO@@#@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@#@#oO*#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@Oo*o#@##@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@####@@OoOo#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@°°°*#@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@#**°oo*###@@@@@@@@@@@@@@@@@@@@@@@@@@@#@o.°°°°*#@#@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@#@#Oo*°°°.°°°o@#@@@@@@@@@@@@@@@@@@@@@@@@@@@#@O*°****#@#@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@#@O°****ooO###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@####@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##@@@@##@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@#@@@#######@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@###@@@@@@@@@@@@@@@@" +
                "\n\n\n" +

                "°**                   .oo°\n" +
                "*O@@@°  .°**oooooo**°.  *@@@O*\n" +
                "°o*°oO..°°°°°.....°°°°..Oo*oO°\n" +
                "....°°°°**************°°°.....\n" +
                "..   °##o°..*O##O*..°o##°    .\n" +
                "     O@     °@@°     @O       \n" +
                "      .*°°°o#**#o°°°*.       \n" +
                "      .*Oo*OoO°°OoO*OO°.      \n" +
                "oOooO#o°.oo°OooO°o* *O#oo##° \n" +
                "*O@@@.  °O°o#o*#O°O°  #@@O*. \n" +
                "   ***   °####OO####°  .°°    \n" +
                "         .*O####O*.          \n");

    }

}
