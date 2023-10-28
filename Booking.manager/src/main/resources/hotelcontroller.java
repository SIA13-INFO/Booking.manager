import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {

    @GetMapping("/rezervari")
    public String afiseazaPaginaRezervari(Model model) {
        // Adăugați aici logica pentru a aduce datele necesare din baza de date sau altă sursă.
        // De asemenea, puteți adăuga acele date la model pentru a le afișa în pagină.

        return "rezervari"; // Acesta este numele șablonului HTML pe care îl veți crea mai târziu.
    }
}
