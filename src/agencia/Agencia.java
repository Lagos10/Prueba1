package agencia;

import javax.swing.JOptionPane;

public class Agencia {
    public void menu(){
        VentaVehiculo obj = new VentaVehiculo();
        Vehiculo matCarros[][]= new Vehiculo [2][2];
        byte opc=1;
        
        while(opc>=1 && opc <7){
            opc= Byte.parseByte(JOptionPane.showInputDialog("1.Realizar venta\n2.Imprimir venta\n3.Lista de carros con extras\n4.Lista de autos con precio mayor a 25 millones\n5.Modelos de autos color verde\n6.Carro mas caro\n7.Salir\nDigite una opción"));
            switch(opc){
                case 1: obj.venta(matCarros);
                break;
                case 2: obj.imprimeVenta(matCarros);
                break;
                case 3: obj.carrosExtra(matCarros);
                break;
                case 4:obj.costo25Millones(matCarros);
                break;
                case 5: obj.autosVerdes(matCarros);
                break;
                case 6: obj.carroCaro(matCarros);
                break;
                default: System.out.println("Saliendo del sistema...");
            }
        }
    }//menu

    public static void main(String[] args) {
        Agencia ob= new Agencia();
        ob.menu();
    }
    
}
