package com.cloud.storageacct.controller;
import com.cloud.storageacct.service.AzureBlobService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/upload")
public class AzureStorageAcctFileUploadController {
        private final AzureBlobService blobService;

        public AzureStorageAcctFileUploadController(AzureBlobService blobService) {
            this.blobService = blobService;
        }

        @PostMapping
        public String upload(@RequestParam("file") MultipartFile file) throws Exception {
            blobService.uploadFile(
                    file.getOriginalFilename(),
                    file.getInputStream(),
                    file.getSize()
            );
            return "File uploaded successfully!";
        }
    }

