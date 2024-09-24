import java.util.ArrayList;

public class SistemaGerenciamento {
    private ArrayList<ClinicaMedica> clinicaMedica;


    public void addClinicaMedica(ClinicaMedica clinicaMedica) {
        this.clinicaMedica.add(clinicaMedica);
    }

    public void removeClinicaMedica(ClinicaMedica clinicaMedica) {
        this.clinicaMedica.remove(clinicaMedica);
    }
}

