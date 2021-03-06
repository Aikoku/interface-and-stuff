/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package People_Palk;

/**
 *
 * @author Mark
 */
public class UspeshnijStudent extends Student implements Dohodnost {
    
    protected int stipendija;

    public UspeshnijStudent(String name, int stipendija) {
        super(name);
        this.stipendija = stipendija;
    }

    @Override
    public String urovenDohodnosti() {
        
        if (stipendija < MINIMALNIJ_PEREVES) {
            return "[Низкий уровень дохода]";
        } else if (stipendija > VISOKIJ_PEREVES) {
            return "[Высокий уровень дохода]";
        } else {
            return "[Средний уровень дохода]";
        }
    }

    @Override
    public String toString() {
        return urovenDohodnosti()+" Uspeshnij Student{" +super.toString()+ " stipedija= " + stipendija + '}';
    } 
}
