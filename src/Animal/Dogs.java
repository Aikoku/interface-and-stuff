/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Mark
 */
public class Dogs extends Animals implements Voice, Xishn {

    public Dogs(String name, int price) {
        super(name, price);
    }

    public Dogs() {
    }


    @Override
    public String toString() {
        return "Dogs{" + super.toString() + "} "+xishn()+" "+voice();
    }


    public String xishn() {
        return "Хичный Ведет охоту на котов ";
    }
    
    public String voice(){
        return "Голос Гавкает ";
    }

}
