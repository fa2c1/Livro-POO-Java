package code.unidade4.secao2.sp.simulator.core;

/**
 * Classe abstrata que modela a ideia de robô.
 * @author Jesimar da Silva Arantes
 * Código 4.14
 */
public abstract class RoboIdeia {
    protected float posicaoX;
    protected float posicaoY;
    protected Orientacao orientacao;
    protected String nome;
    protected float peso;
    
    /**
     * Assinatura do método que move o robô.
     * @param posX posição x em que o robô será movido.
     * @param posY posição y em que o robô será movido.
     */
    public abstract void move(float posX, float posY);
    
    /**
     * Assinatura do método que move o robô ao longo do eixo x.
     * @param dist distância a partir da posição atual no eixo x que será movido o robô. 
     */
    public abstract void moveX(float dist);
    
    /**
     * Assinatura do método que move o robô ao longo do eixo y.
     * @param dist distância a partir da posição atual no eixo y que será movido o robô.
     */
    public abstract void moveY(float dist);
}
