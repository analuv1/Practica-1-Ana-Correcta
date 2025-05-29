/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prácticaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell 7490
 */
public class PrácticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Instrucciones:
        calcular
        Seguro de Enfermedad y Maternidad (SEM) al 9.25% del salario.
        Invalidez, Vejez y Muerte (IVM) al 5.08% del salario.
        2.5% para la asociación.
        Cree una variable llamada variableMuestra y sume los tres montos ahí

         */
        
        /* 
        Universidad Fidélitas
        Introducción a la programación
        Ana Lucía Varela Jiménez
        Semana 3: 28-5-25
        */
        double SalarioI = 0; //inicializar las variables
        double Sem = 0; 
        double IVM = 0;
        double Asocia = 0;

        String Leer;

        Leer = JOptionPane.showInputDialog(null, "Dígite su salario individual:");
        SalarioI = Double.parseDouble(Leer);

        Sem = (SalarioI * 0.0925); //Se calcula el Salario del SEM
        IVM = (SalarioI * 0.0508); // Se calcula el Salario del IVM
        double VariableMuestra = Sem + IVM; //Se saca una Variable1 que es la suma de SEM y IVM
        double Variable2= SalarioI - VariableMuestra; //Se le resta al salario Inicial la variable1
        Asocia = (Variable2 * 2.5)/100; //calculo de asosiación

        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto:" + VariableMuestra);
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto:"+Asocia);

    }

}
