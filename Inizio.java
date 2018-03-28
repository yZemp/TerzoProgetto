import javax.swing.*;
public class Inizio
{

    private JFrame frame;
    private String pippoz;
    private static String DEFAULT = "Start";


    public void main(String[] arg)
    {
        String valoreAttualeDelNome = "";

        try
        {
            valoreAttualeDelNome = arg[0];
        } catch (Exception haiFattoUnErrore)
        {
            System.out.println(haiFattoUnErrore);
            valoreAttualeDelNome = DEFAULT;
        }

        this.creaBottone(valoreAttualeDelNome);
    }

    private void creaBottone(String nomeArrivatoComeParametro)
    {
        frame = new JFrame();
        frame.setSize(700,350);

        JButton bottone;
        bottone = new JButton();
        bottone.setText(nomeArrivatoComeParametro);
        System.out.println(nomeArrivatoComeParametro);

        bottone.setVisible(true);
        frame.add(bottone);
        frame.setVisible(true);

        try
        { 
            Thread.sleep(300);
        } catch (Exception unErrore) {}

        bottone.setVisible(false);

        try
        { 
            Thread.sleep(4000);
        } catch (Exception unErrore) {}

        bottone.setText(DEFAULT);
        bottone.setVisible(true);
    }
}
