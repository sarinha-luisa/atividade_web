package br.uninove;

public class Bhaskara {

    private String a;
    private String b;
    private String c;
    private double delta;
    private double rP;
    private double rN;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getrP() {
        return rP;
    }

    public void setrP(double rP) {
        this.rP = rP;
    }

    public double getrN() {
        return rN;
    }

    public void setrN(double rN) {
        this.rN = rN;
    }

    //----- métodos: -----
    public String calculaBhaskara() {
        double aD, bD, cD;
        aD = Double.parseDouble(a);
        bD = Double.parseDouble(b);
        cD = Double.parseDouble(c);

        delta = (bD * bD) - 4 * aD * cD;

        if (delta < 0) {
            return "Delta é menor que zero! (" + delta + ")";
        } else {
            //vamos calcular as raízes baseado no Delta:
            return "<strong>Delta: </strong>" + delta + "<br>"
                    + "<strong>X': </strong>" + calculaRaizes(aD, bD, TipoRaiz.POSITIVA) + "<br>"
                    + "<strong>X'': </strong>" + calculaRaizes(aD, bD, TipoRaiz.NEGATIVA);
        }
    }

    private double calculaRaizes(double a, double b, TipoRaiz tipo) {
//        switch(tipo) {
//            case positiva:
//                return (-b + Math.sqrt(delta) / (2 * a)); 
//        }
//        return (-b - Math.sqrt(delta) / (2 * a));

        
        //<condição booleana> ? <resultado se TRUE> : <resultado de FALSE>
//        if(tipo == TipoRaiz.positiva) {
//            return (-b + Math.sqrt(delta) / (2 * a));
//        } else {
//            return (-b - Math.sqrt(delta) / (2 * a));
//        }
        return (tipo == TipoRaiz.POSITIVA)
                ? ((-b + Math.sqrt(delta)) / (2 * a))
                : ((-b - Math.sqrt(delta)) / (2 * a));
    }
}
