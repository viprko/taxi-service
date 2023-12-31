package taxi.service.impl;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;
import taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String username, String password) throws AuthenticationException {
        Optional<Driver> user = driverService.findByLogin(username);
        if (user.isEmpty() || !user.get().getPassword().equals(password)) {
            throw new AuthenticationException("Username or password was incorrect");
        }
        return user.get();
    }
}
