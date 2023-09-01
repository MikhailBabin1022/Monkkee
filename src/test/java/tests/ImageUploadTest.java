package tests;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageUploadTest {
    public static void main(String[] args) {
        try {
            // Путь к изображению
            String imagePath = "";

            // Загрузка изображения в виде объекта BufferedImage
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Дальнейшие операции с изображением...

            // Пример: Получение ширины и высоты изображения
            int width = image.getWidth();
            int height = image.getHeight();

            // Вывод информации о размерах изображения
            System.out.println("Ширина: " + width);
            System.out.println("Высота: " + height);

            // Дополнительные операции с изображением...

        } catch (IOException e) {
            // Обработка исключения, если произошла ошибка при чтении изображения
            e.printStackTrace();
        }
    }
}