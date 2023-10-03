package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.List;

public interface FacultyService {
    Faculty add(Faculty faculty);

    Faculty get(Long id);

    Faculty update(Long id, Faculty faculty);

    void delete(Long id);

    List<Faculty> getAllFaculties();

    List<Faculty> findByColor(String color);
    List<Faculty> findByColorIgnoreCase(String color);

}
