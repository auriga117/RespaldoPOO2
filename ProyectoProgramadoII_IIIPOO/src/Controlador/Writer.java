/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Arrays;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import Clases.Platillo;
import Clases.TipoPlatillo;
import Clases.imgHandler;
public class Writer {
    /**
     * Escribe en un archivo XML el catalogo
     * @param platillos 
     */
    public void Writer(Platillo[] platillos){
        try {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                
		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("Catalogo");
		doc.appendChild(rootElement);

		// staff elements
		

		// firstname elements
                int cont = 0;
                while(cont < platillos.length ){
                    
                Element platillo = doc.createElement("Platillo");
		rootElement.appendChild(platillo);

		// shorten way
		//platillo.setAttribute("id", "BEB-"+Integer.toString(cont));//aqui falta cambiarlo para que sea el tipo de platillo correcto, 
                                                                            //pero hasta que hagan la clase TipoPlatillo
                 
                Element nombre = doc.createElement("nombre");
		nombre.appendChild(doc.createTextNode(platillos[cont].getNombre()));
		platillo.appendChild(nombre);
                
		Element descripcion = doc.createElement("descripcion");
		descripcion.appendChild(doc.createTextNode(platillos[cont].getDescripcion()));
		platillo.appendChild(descripcion);

                
		Element precio = doc.createElement("precio");
		precio.appendChild(doc.createTextNode(Double.toString(platillos[cont].getPrecio())));
		platillo.appendChild(precio);
                
                Element tipoPorcion = doc.createElement("tipoPorcion");
		tipoPorcion.appendChild(doc.createTextNode(platillos[cont].getTipoPorcion()));
		platillo.appendChild(tipoPorcion);
                
                Element habilitado = doc.createElement("Habilitado");
		habilitado.appendChild(doc.createTextNode(Boolean.toString(platillos[cont].getHabilitado())));
		platillo.appendChild(habilitado);
                
                Element cantPedidos = doc.createElement("CantPedidos");
		cantPedidos.appendChild(doc.createTextNode(Integer.toString(platillos[cont].getCantPedidos())));
		platillo.appendChild(cantPedidos);
                
                Element codClave = doc.createElement("codClave");
		codClave.appendChild(doc.createTextNode(platillos[cont].getCodClave()));
		platillo.appendChild(codClave);
                
                Element cantPlatos = doc.createElement("CantPlatos");
		cantPlatos.appendChild(doc.createTextNode(Integer.toString(platillos[cont].getCantidadPlatos())));
		platillo.appendChild(cantPlatos);
                
                Element calorias = doc.createElement("calorias");
		calorias.appendChild(doc.createTextNode(Integer.toString(platillos[cont].getCalorias())));
		platillo.appendChild(calorias);
                
                Element kilokcalPorGramo = doc.createElement("kilokcalPorGramo");
		kilokcalPorGramo.appendChild(doc.createTextNode(Double.toString(platillos[cont].getKilokcalPorGramo())));
		platillo.appendChild(kilokcalPorGramo);
                
                Element gramosPorPorcion = doc.createElement("gramosPorPorcion");
		gramosPorPorcion.appendChild(doc.createTextNode(Double.toString(platillos[cont].getGramosPorPorcion())));
		platillo.appendChild(gramosPorPorcion);
                
                Element imagen = doc.createElement("imagen");
		imagen.appendChild(doc.createTextNode(Arrays.toString(platillos[cont].getImagen())));
		platillo.appendChild(imagen);
                
                    switch (platillos[cont].getTipoPlatillo()) {
                        case BEB:
                            {
                                Element tipoPlatillo = doc.createElement("tipoPlatillo");
                                tipoPlatillo.appendChild(doc.createTextNode("BEB"));
                                platillo.appendChild(tipoPlatillo);
                                break;
                            }
                        case ETR:
                            {
                                Element tipoPlatillo = doc.createElement("tipoPlatillo");
                                tipoPlatillo.appendChild(doc.createTextNode("ETR"));
                                platillo.appendChild(tipoPlatillo);
                                break;
                            }
                        case PRN:
                            {
                                Element tipoPlatillo = doc.createElement("tipoPlatillo");
                                tipoPlatillo.appendChild(doc.createTextNode("PRN"));
                                platillo.appendChild(tipoPlatillo);
                                break;
                            }
                        case PTR:
                            {
                                Element tipoPlatillo = doc.createElement("tipoPlatillo");
                                tipoPlatillo.appendChild(doc.createTextNode("PTR"));
                                platillo.appendChild(tipoPlatillo);
                                break;
                            }
                        default:
                            break;
                    }
                
                
                
                
                cont++;
                }
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("file.xml"));// aqui tienen que cambiar la direccion a la que ustedes quieran

		// Output to console for testing
		// StreamResult result = new StreamResult(System.out);

		transformer.transform(source, result);

		System.out.println("File saved!");

	  } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
	  }
    }

    public static void main(String argv[]) {
        Writer xml = new Writer();
        File nuevo = new File("/home/retr0/Documentos/Wallpaper/poryecto arqui/descarga.png");
        imgHandler imagen = new imgHandler();
        
        Platillo platillito = new Platillo();
        platillito.setNombre("pizzaaa");
        platillito.setPrecio(1000);
        platillito.setDescripcion("muy rica");
        platillito.setHabilitado(true);
        platillito.setCodClave("BEB-001");
        platillito.setCantPedidos(10);
        platillito.setTipoPorcion("plato");
        platillito.setCantidadPlatos(3);
        platillito.setCalorias(100);
        platillito.setKilokcalPorGramo(100);
        platillito.setGramosPorPorcion(200);
        platillito.setImagen(imagen.AbrirIMG(nuevo));
        platillito.setTipoPlatillo(TipoPlatillo.PTR);
        Platillo[] lista = new Platillo[2];
        lista[0]= platillito;
        Platillo platillito2 = new Platillo();
        platillito2.setNombre("macarrones");
        platillito2.setPrecio(10020);
        platillito2.setDescripcion("muy rico");
        platillito2.setHabilitado(false);
        platillito2.setCodClave("BEB-001");
        platillito2.setCantPedidos(12);
        platillito2.setTipoPorcion("plato");
        platillito2.setCantidadPlatos(6);
        platillito2.setCalorias(200);
        platillito2.setKilokcalPorGramo(150);
        platillito2.setGramosPorPorcion(250);
        platillito2.setImagen(imagen.AbrirIMG(nuevo));
        platillito2.setTipoPlatillo(TipoPlatillo.PRN);
        lista[1] = platillito2;
        //System.out.println(lista[0].getNombre());
        xml.Writer(lista);
        
        
    }
}

