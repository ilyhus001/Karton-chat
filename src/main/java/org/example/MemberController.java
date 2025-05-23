package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberRepository repository;

    /**
     * Default home page for member
     */
    @GetMapping("/home")
    public String displayAdminPage() {
        return "member";
    }
}
