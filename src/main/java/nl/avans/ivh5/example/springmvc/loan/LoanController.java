package nl.avans.ivh5.example.springmvc.loan;

import nl.avans.ivh5.example.springmvc.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 */
@Controller
public class LoanController {

    private LoanRepository loanRepository;

    @Autowired
    public LoanController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @ModelAttribute("page")
    public String module() {
        return "loans";
    }
}