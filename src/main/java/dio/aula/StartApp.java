package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.repository.UserRepository;
import dio.aula.model.User;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Isaque");
        user.setUsername("Isq");
        user.setPassword("123456789");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
    
}
