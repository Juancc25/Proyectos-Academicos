package Mcd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
import java.awt.Font;

public class MCD extends JFrame implements ActionListener{

    JFrame marco=new JFrame();
    JButton boton = new JButton("CALCULAR");
    JLabel Cantidad = new JLabel("Digite la cantidad de números a procesar");
    JLabel Numeros = new JLabel("Digite los números separados por el símbolo ',':");
    JLabel Error = new JLabel();
    JLabel imagen = new JLabel();
    JLabel Propietario = new JLabel("Juan Camilo Cuellar Tole - 20201020136");
    JTextField Num = new JTextField();
    JTextField Cant = new JTextField();
    JTextArea proceso1 = new JTextArea();
    JTextArea proceso2 = new JTextArea();
    JTextArea proceso3 = new JTextArea();
    JScrollPane scroll1 = new JScrollPane (proceso1);
    JScrollPane scroll2 = new JScrollPane (proceso2);
    JScrollPane scroll3 = new JScrollPane (proceso3);
    String mensaje1="";
    String mensaje2="";
    String mensaje3="";
    String mensaje4="";
    String a1[];
    Font font1 = new Font("Times New Roman", 1, 11);
    Font font2 = new Font("Times New Roman", 1, 13);
    Font font3 = new Font("Times New Roman", 1, 14);
    Font font4 = new Font("Times New Roman", Font.BOLD, 12);
    int y[];
    int z[];
    int p[];
    int back;
    int x;
    int mcdf;
    int contador=0;
    //Icon Imagen = new ImageIcon("C:\\Users\\kerwi\\OneDrive\\Documentos\\NetBeansProjects\\MCD\\src\\main\\java\\com\\mycompany\\imagen\\operacion.png");

    MCD(){
        marco.getContentPane().setBackground(Color.GRAY);
        marco.setTitle("¡¡Combinación Lineal!!");
        marco.setSize(490,670);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setLayout(null);

        marco.add(boton);
        boton.setBounds(190,110,100,30);
        boton.setBackground(new Color(255, 138, 134));
        boton.addActionListener(this);
        marco.add(Cantidad);
        Cantidad.setBounds(30,30,230,25);
        Cantidad.setForeground(Color.WHITE);
        marco.add(Numeros);
        Numeros.setBounds(30,70,280,25);
        Numeros.setForeground(Color.WHITE);
        marco.add(Cant);
        Cant.setBounds(300,30,30,25);
        Cant.setBackground(new Color(56, 139, 140));
        marco.add(Num);
        Num.setBounds(300,70,150,25);
        Num.setBackground(new Color(56, 139, 140));
        marco.add(Error);
        Error.setBounds(360,30,250,25);
        Error.setForeground(new Color(124, 14, 14));
        marco.add(Propietario);
        Propietario.setBounds(240,590,250,25);
        Propietario.setBackground(Color.black);
        scroll1.setBounds(30,170,200,200);
        proceso1.setBackground(new Color(151, 103, 159));
        marco.add(scroll1);
        scroll2.setBounds(240,170,200,200);
        proceso2.setBackground(new Color(151, 103, 159));
        marco.add(scroll2);
        scroll3.setBounds(130,380,200,200);
        proceso3.setBackground(new Color(151, 103, 159));
        marco.add(scroll3);
        Cantidad.setFont(font2);
        Numeros.setFont(font2);
        Error.setFont(font3);
        Propietario.setFont(font4);
        proceso1.setEditable(false);
        proceso1.setFont(font1);
        proceso2.setEditable(false);
        proceso2.setFont(font1);
        proceso3.setEditable(false);
        proceso3.setFont(font1);
        marco.add(imagen);
        //imagen.setIcon(Imagen);
        //imagen.setBounds(240, 380, 200, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            limpiar();
            int x;
            x=obtener();
            if(x!=0) {
                calcular(x-1);
                escribir();
            }
        }
    }

    int obtener () {

        Error.setText("");
        String aux;
        aux=Cant.getText();
        x=leerdatos(aux);
        y = new int [x];
        z = new int [x];
        p = new int [x];
        aux=Num.getText();
        a1=aux.split(",");
        if (a1.length!=y.length) {
            JOptionPane.showMessageDialog(null,"Cantidad de números incorrecta");
            return 0;
        }
        for(int i=0;i<x;i++){
            aux=a1[i];
            y[i]=leerdatos(aux);
        }
        for(int i=0;i<x;i++) p[i] = y[i];
        Arrays.sort(y);
        mensaje1="\n   Ordenar de mayor a menor\n   "+Arrays.toString(y)+"\n\n   Primer paso\n   Calcular MCD:\n\n";
        mensaje2="\n   Segundo paso\n   Despejar las ecuaciones:\n\n";
        mensaje3="\n   La combinación lineal de\n   "+Arrays.toString(p)+" es:\n\n   Tercer paso\n   Expresar cada par de numeros \n   como combinación lineal:\n\n";
        mensaje4="   Cuarto paso\n   Despejar las igualdades:";
        return x;
    }

    boolean verificacion(String x) {
        int j;
        try {
            j=Integer.parseInt(x);
            if(j<=0) {
                JOptionPane.showMessageDialog(null,"Número no permitido.");
                return false;
            }
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,"Hay un carácter inválido.");
            return false;
        }
    }

    int leerdatos(String x) {
        int y=0;
        if (verificacion(x) == false) {
        } else {
            y = Integer.parseInt(x);
        }
        return y;
    }

    int mcd(int a, int b) {
        if(b == 0) return a;
        mensaje1=mensaje1+("      "+a+"="+b+"*"+a/b+"+"+a%b)+"\n";
        mensaje2=mensaje2+("      "+b+"="+a%b+"*"+a/b+"-"+a)+"\n";
        return mcd(b, a%b);
    }

    long[] mcdext(int a, int b) {
        long[] r = new long [3];
        long x=0,y=0;
        if(b==0){
            r[0] = a;
            r[1] = 1;
            r[2] = 0;
        }else{
            long x2 = 1, x1 = 0, y2 = 0, y1 = 1;
            long q = 0, re = 0;
            while(b>0){
                q = (a/b);
                re = a - q*b;
                x = x2-q*x1;
                y = y2 - q*y1;
                a = b;
                b = (int) re;
                x2 = x1;
                x1 = x;
                y2 = y1;
                y1 = y;
            }
            r[0] = a;
            r[1] = x2;
            r[2] = y2;
            if(contador==0){
                z[0] = (int)x2;
                z[1] = (int)y2;
                contador++;
            }else{
                back = (int)x2;
                for(int i=0; i< z.length ; i++){
                    z[i]=z[i]*back;
                }
                z[contador+1] = (int)y2;
                if(contador<z.length){
                    contador++;
                }
            }
        }
        return r;
    }

    int calcular(int j) {
        int k=y[j];
        long[] r = new long [3];
        for(int i=j; i>0; i--) {
            k=mcd(k,y[i-1]);
            mensaje1=mensaje1+"\n";
            mensaje2=mensaje2+"\n";
        }
        k=p[0];
        for(int i=0; i<j; i++) {
            r=mcdext(k,p[i+1]);
            mensaje3=mensaje3+("      "+r[0]+"="+"("+r[1]+")"+""+k+"+"+"("+r[2]+")"+""+p[i+1]+"\n\n");
            k=(int)r[0];
        }
        mcdf=k;
        mensaje4="   Despejamos y generalizamos \n   para hallar combinacion lineal\n\n     "+mcdf+" = ";
        for(int i=0; i< z.length ; i++){
            if(z[i]==0){
                mensaje3=mensaje3+" ->El numero "+p[(i)]+" es multiplicado\n por 0, por lo tanto no se expresa en \n la combinacion lineal\n\n";
            }else{
                mensaje4=mensaje4+"+"+p[(i)]+"*"+"("+z[i]+")";
            }
        }
        mensaje4+="\n\n";
        Error.setForeground(Color.WHITE);
        Error.setText("MCD: "+ k);
        return 0;
    }

    void escribir() {
        proceso1.setText(mensaje1);
        proceso2.setText(mensaje2);
        proceso3.setText(mensaje3+mensaje4);
    }

    void limpiar() {
        mensaje1=mensaje2=mensaje3="";
        contador=0;
        mcdf=0;
    }
}