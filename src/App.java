public class App {

    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        Ponto pontoA = new Ponto("A");
        Ponto pontoB = new Ponto("B");
        Ponto pontoC = new Ponto("C");
        Ponto pontoD = new Ponto("D");
        Ponto pontoE = new Ponto("E");
        Ponto pontoF = new Ponto("F");
        Ponto pontoG = new Ponto("G");
        Ponto pontoH = new Ponto("H");
        Ponto pontoI = new Ponto("I");
        Ponto pontoJ = new Ponto("J");
        Ponto pontoK = new Ponto("K");
        Ponto pontoL = new Ponto("L");
        Ponto pontoM = new Ponto("M");
        Ponto pontoN = new Ponto("N");
        Ponto pontoO = new Ponto("O");
        Ponto pontoP = new Ponto("P");
        Ponto pontoQ = new Ponto("Q");
        Ponto pontoR = new Ponto("R");
        Ponto pontoS = new Ponto("S");
        Ponto pontoT = new Ponto("T");
        Ponto pontoU = new Ponto("U");
        Ponto pontoV = new Ponto("V");
        Ponto pontoX = new Ponto("X");

        mapa.adicionarPonto(pontoA);
        mapa.adicionarPonto(pontoB);
        mapa.adicionarPonto(pontoC);
        mapa.adicionarPonto(pontoD);
        mapa.adicionarPonto(pontoE);
        mapa.adicionarPonto(pontoF);
        mapa.adicionarPonto(pontoG);
        mapa.adicionarPonto(pontoH);
        mapa.adicionarPonto(pontoI);
        mapa.adicionarPonto(pontoJ);
        mapa.adicionarPonto(pontoK);
        mapa.adicionarPonto(pontoL);
        mapa.adicionarPonto(pontoM);
        mapa.adicionarPonto(pontoN);
        mapa.adicionarPonto(pontoO);
        mapa.adicionarPonto(pontoP);
        mapa.adicionarPonto(pontoQ);
        mapa.adicionarPonto(pontoR);
        mapa.adicionarPonto(pontoS);
        mapa.adicionarPonto(pontoT);
        mapa.adicionarPonto(pontoU);
        mapa.adicionarPonto(pontoV);
        mapa.adicionarPonto(pontoX);

        mapa.adicionarCaminho(pontoA, pontoB, 300);
        mapa.adicionarCaminho(pontoB, pontoC, 47);
        mapa.adicionarCaminho(pontoC, pontoD, 62);
        mapa.adicionarCaminho(pontoD, pontoE, 8);
        mapa.adicionarCaminho(pontoE, pontoF, 13);
        mapa.adicionarCaminho(pontoE, pontoG, 230);
        mapa.adicionarCaminho(pontoC,pontoH,141);
        mapa.adicionarCaminho(pontoH,pontoI,138);
        mapa.adicionarCaminho(pontoI,pontoJ,153);
        mapa.adicionarCaminho(pontoJ, pontoK, 512);
        mapa.adicionarCaminho(pontoK, pontoL, 135);
        mapa.adicionarCaminho(pontoL,pontoM,15);
        mapa.adicionarCaminho(pontoL, pontoN, 187);
        mapa.adicionarCaminho(pontoN, pontoO, 108);
        mapa.adicionarCaminho(pontoO, pontoP, 82);
        mapa.adicionarCaminho(pontoP, pontoQ, 215);
        mapa.adicionarCaminho(pontoQ, pontoR, 97);
        mapa.adicionarCaminho(pontoR, pontoS, 33);
        mapa.adicionarCaminho(pontoR, pontoT, 243);
        mapa.adicionarCaminho(pontoS, pontoT, 207);
        mapa.adicionarCaminho(pontoS, pontoV, 38);
        mapa.adicionarCaminho(pontoV, pontoU, 210);
        mapa.adicionarCaminho(pontoV, pontoA, 370);
        mapa.adicionarCaminho(pontoA, pontoX, 317);
        mapa.adicionarCaminho(pontoU, pontoT, 22);
        mapa.adicionarCaminho(pontoX, pontoU, 107);

        //mapa.MostrarPontos();
        //mapa.MostrarCaminhos();

        mapa.encontrarCaminhoCurto(pontoR, pontoV);
    }
}
