package com.uniloftsky.springframework.spring5freelancedeliveryservice.bootstrap;

import com.uniloftsky.springframework.spring5freelancedeliveryservice.model.Type;
import com.uniloftsky.springframework.spring5freelancedeliveryservice.model.User;
import com.uniloftsky.springframework.spring5freelancedeliveryservice.repositories.TypeRepository;
import com.uniloftsky.springframework.spring5freelancedeliveryservice.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final TypeRepository typeRepository;
    private final UserRepository userRepository;

    public DataLoader(TypeRepository typeRepository, UserRepository userRepository) {
        this.typeRepository = typeRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Type> types = new HashSet<>();
        types.add(new Type("Таксі"));
        types.add(new Type("Короткі відстані"));
        types.add(new Type("Довгі відстані"));
        types.add(new Type("Великі вантажі"));

        typeRepository.saveAll(types);

        List<User> users = new ArrayList<>();
        users.add(new User("login", "123456", "mail@mail.com", "Anton", "Kulyk", "1234567890"));
        User user = users.get(0);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String newPassword = encoder.encode(user.getPassword());
        user.setPassword(newPassword);

        userRepository.save(user);
    }
}
