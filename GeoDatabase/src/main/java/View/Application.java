package View;

import java.util.List;
import model.Aeroporto;
import model.AeroportoService;
import model.Cidadegemea;
import model.CidadegemeaService;
import model.EstadoService;
import model.Estado;
import model.Ferrovia;
import model.FerroviaService;
import model.Hidrovia;
import model.HidroviaService;
import model.MunicipioService;
import model.Municipio;
import model.Rodovia;
import model.RodoviaService;
import util.JPAUtil;

public class Application {
    public static void main(String[] args) {
       MunicipioService municipioService = new MunicipioService();
       
       //Imprimindo todos os Aeroportos do Brasil
       AeroportoService aeroportoService = new AeroportoService();
       List<Aeroporto> aeroportos = aeroportoService.listarAeroportos();
       for (Aeroporto a: aeroportos){
           System.out.println(a);
       }
       
       //Imprimir Municipios proximos a Bananeiras
       List<Municipio> municipios = municipioService.listarMunicipiosVizinhos("Bananeiras");
       for (Municipio m: municipios){
            System.out.println(m);
       }  
       
       //Imprimir distancia entre os municipios de Guarabira e Bananeiras
       double distancia = municipioService.distanciaEntreMunicipios("Guarabira", "Bananeiras");
       System.out.printf("Distância em km: %.2f\n", distancia / 1000);
      
       //Imprimindo todos os Municipios da PB
       EstadoService estadoService = new EstadoService();
       List<Estado> estados = estadoService.listarMuni("PB");
       for (Estado es: estados){
            System.out.println(es);
       } 
       
       //Imprimindo todas as Rodovias do Brasil
       RodoviaService rodoviaService = new RodoviaService();
       List<Rodovia> todas = rodoviaService.listarTodos();
       for (Rodovia ro: todas){
           System.out.println(ro);
       }
       
       //Imprimindo o rio associado a Hidrovia do Rio Jacui
       HidroviaService hidroviaService = new HidroviaService();
       List<Hidrovia> rioHidro = hidroviaService.hidroRio("Hidrovia do Rio Jacuí");
       for (Hidrovia re: rioHidro){
            System.out.println(re);
       } 
       
       //Imprimindo todas as Ferrovias do Brasil
       FerroviaService ferroviaService = new FerroviaService();
       List<Ferrovia> ferrovia = ferroviaService.listarFerrovia();
       for (Ferrovia f: ferrovia){
           System.out.println(f);
       }
       
       //Imprimindo todas as Cidades Gemeas do Brasil
       CidadegemeaService cidadegemeaService = new CidadegemeaService();
       List<Cidadegemea> cidade = cidadegemeaService.listarCidades();
       for (Cidadegemea c: cidade){
           System.out.println(c);
       }
       
       //Imprimindo a operadora da Ferrovia Norte Sul com Gid 1737
       List<Ferrovia> opferrovia = ferroviaService.operadoraFerrovia("Ferrovia Norte Sul", 1737);
       for (Ferrovia xs: opferrovia){
            System.out.println(xs);
       } 
       
       //Imprimindo se a Ferrovia Norte Sul passa por Bananeiras
       List<Municipio> ferroviasCrosses = municipioService.ferroviaCrosses("Bananeiras", "Ferrovia Norte Sul");
       for (Municipio m: ferroviasCrosses){
            System.out.println(m);
       }         
       
       JPAUtil.close();
    }

}
