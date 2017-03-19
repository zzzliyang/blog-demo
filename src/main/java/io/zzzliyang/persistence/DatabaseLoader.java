package io.zzzliyang.persistence;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Liyang, Zhang on 3/19/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private static final Logger LOGGER = Logger.getLogger(CommandLineRunner.class.getName());
    private final MovieRepository repository;

    @Autowired
    public DatabaseLoader(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        try {
            this.repository.save(new Movie("Leon", 9.4));
            LOGGER.log(Level.INFO, "New record added.");
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Record already exists.");
        }
    }
}
