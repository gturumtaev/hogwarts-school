package ru.hogwarts.school.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AvatarService {
    public void uploadAvatar(Long studentId, MultipartFile avatar) throws IOException;

    public ResponseEntity<byte[]> downloadAvatarByStudentFromDb(Long studentId);

    public void downloadAvatarFromFileSystem(Long studentId, HttpServletResponse response) throws IOException;
}
