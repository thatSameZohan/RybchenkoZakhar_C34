package org.tms.project.interfaces;

import org.tms.project.domain.User;

public interface UserValidationService {

    boolean isValid(User user);
}
