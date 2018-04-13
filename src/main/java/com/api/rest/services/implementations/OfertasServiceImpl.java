package com.api.rest.services.implementations;

import com.api.rest.models.Ofertas;
import com.api.rest.services.CustomerService;
import com.api.rest.services.OfertasService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Service
public class OfertasServiceImpl implements OfertasService{
    
    // Contador responsável por gerar um fake ID 
    private final AtomicLong id = new AtomicLong();
    //recebe os dados instanciados da classe ofertas
    private final ArrayList<Ofertas> of = new ArrayList<>();
    
    // Método responsável por retornar todas as ofertas
    // mais uma vez essas informações são mocks
    @Override
    public List<Ofertas> findAll() {
        
        ArrayList<Ofertas> n = mockOfertas();
       
        return of;
    }
    //Metodo le o arquivo nfe e o 
    public BufferedReader lerTxt(String txt) {
        
        ApplicationContext appContext = 
                    new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});

        CustomerService cust = (CustomerService)appContext.getBean("customerService");
        String path = "classpath:com/files/txt/"+txt;
        org.springframework.core.io.Resource resource = cust.getResource(path);

        try{
                InputStream is = resource.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                return br;

        }catch(IOException e){
                e.printStackTrace();
        }
        return null;
    }
    //armazenar dados do txt dentro de um arrayList
    private ArrayList<Ofertas> mockOfertas() {
        
        String line = "";
        String[] c = null;

        BufferedReader br = lerTxt("baseDadosOfertas.txt");

        try {

            while(br.ready()){
                Ofertas ofertas = new Ofertas();
                line = br.readLine();
                if(!line.startsWith("categoria;titulo;descricao_oferta;anunciante;valor;destaque")) {

                     c = line.split(";");
                    if(c.length > 1) {
                        ofertas.setId(id.incrementAndGet());
                        ofertas.setCategoria(c[0]);
                        ofertas.setTitulo(c[1]);
                        ofertas.setDescricao_oferta(c[2]);
                        ofertas.setAnunciante(c[3]);
                        ofertas.setValor(Double.valueOf(c[4]));
                        ofertas.setDestaque(Boolean.valueOf(c[5]));
                        
                        of.add(ofertas);
                    }
                 }                    
            }
            br.close();
            
            return of;
        } catch (IOException ex) {
            Logger.getLogger(OfertasServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public Ofertas findStatus(Boolean r) {
        return null;
    }
}
