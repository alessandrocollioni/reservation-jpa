import dao.CityDAO;
import dao.ModalityDAO;
import dao.StateDAO;
import dao.TourTypeDAO;
import domain.City;
import domain.Modality;
import domain.State;
import domain.TourType;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ModalityDAO modalityDAO = new ModalityDAO();
        modalityDAO.save(new Modality("Caminhada"));
        modalityDAO.save(new Modality("Caminhada com fotos"));
        modalityDAO.save(new Modality("Cavalgada"));

        TourTypeDAO tourTypeDAO = new TourTypeDAO();
        TourType tourType = new TourType("Privativo");
        tourTypeDAO.save(tourType);
        tourType = new TourType("Em Grupo");
        tourTypeDAO.save(tourType);

        StateDAO stateDAO = new StateDAO();
        State state = new State("Rio Grande do Sul");
        stateDAO.save(state);

        CityDAO cityDAO = new CityDAO();

        cityDAO.save(new City("Porto Alegre", state));
        cityDAO.save(new City("Gramado", state));
        cityDAO.save(new City("Rio Grande", state));

//        System.out.println(stateDAO.findById(1L).getItems());

        System.out.println(stateDAO.findAll());



    }

}
