import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Image;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.BaseFont;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ozgecmis {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("ozgecmis.pdf"));
            document.open();

            // TÜRKÇE KARAKTER DESTEKLİ FONT
            BaseFont bf = BaseFont.createFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font baslikFont = new Font(bf, 24, Font.BOLD);
            Font altBaslikFont = new Font(bf, 16, Font.BOLD);
            Font normalFont = new Font(bf, 12);
            Font küçükFont = new Font(bf, 11);

            // SAYFA 1
            // BAŞLIK
            Paragraph baslik = new Paragraph("ÖZGEÇMİŞ", baslikFont);
            baslik.setSpacingAfter(20);
            document.add(baslik);

            // FOTOĞRAF EKLEME
            Image foto = Image.getInstance("foto.jpg");
            foto.scaleToFit(90, 90);
            foto.setAlignment(Image.ALIGN_RIGHT);
            foto.setSpacingAfter(10);
            document.add(foto);

            // KİŞİSEL BİLGİLER
            Paragraph kisibilgi = new Paragraph("Kişisel Bilgiler", altBaslikFont);
            kisibilgi.setSpacingAfter(5);
            document.add(kisibilgi);

            document.add(new Paragraph("Ad Soyad: Sude Naz Çolak", normalFont));
            document.add(new Paragraph("Doğum Tarihi ve Yeri: 21.09.2005, İstanbul", normalFont));
            document.add(new Paragraph("Adres: İstasyon Mah. Merkez/Kırklareli", normalFont));
            document.add(new Paragraph("Telefon: 0533 333 3333", normalFont));
            document.add(new Paragraph("E-posta: sudecolak@gmail.com", normalFont));
            document.add(new Paragraph("GitHub: github.com/sudeerhfd", normalFont));

            // KARİYER HEDEFİ
            Paragraph kariyerHedefi = new Paragraph("\nKariyer Hedefi", altBaslikFont);
            kariyerHedefi.setSpacingBefore(10);
            kariyerHedefi.setSpacingAfter(5);
            document.add(kariyerHedefi);

            document.add(new Paragraph(
                    "Yazılım mühendisliği alanında kendimi sürekli geliştirerek, "
                            + "teknolojiye yön veren projelerde yer almak ve yenilikçi çözümler üretmek istiyorum. "
                            + "Takım çalışmasına yatkın, öğrenmeye açık ve sorumluluk sahibi bir mühendis olarak "
                            + "profesyonel kariyerime güçlü bir başlangıç yapmayı hedefliyorum.",
                    normalFont
            ));

            // EĞİTİM
            Paragraph egitim = new Paragraph("\nEğitim", altBaslikFont);
            egitim.setSpacingBefore(10);
            egitim.setSpacingAfter(5);
            document.add(egitim);

            document.add(new Paragraph("2024-2028 - Yazılım Mühendisliği, Kırklareli Üniversitesi", normalFont));
            document.add(new Paragraph("2019-2023 - Çekmeköy Mehmetçik Anadolu Lisesi", normalFont));

            // SAYFA 2
            document.newPage();

            // İŞ DENEYİMLERİ
            Paragraph isDeneyimi = new Paragraph("İş Deneyimleri", altBaslikFont);
            isDeneyimi.setSpacingAfter(5);
            document.add(isDeneyimi);

            document.add(new Paragraph("- Vodafone, Gönüllü Stajyer (2023 Yaz)", normalFont));
            document.add(new Paragraph("  • Müşteri hizmetleri ve temel ofis işleri deneyimi", küçükFont));
            document.add(new Paragraph("  • Takım çalışması ve iletişim becerilerinin geliştirilmesi", küçükFont));

            document.add(new Paragraph("- Uğrak Eczanesi, Gönüllü Stajyer (2022 Yaz)", normalFont));
            document.add(new Paragraph("  • İlaç stok takibi ve müşteri danışmanlığı", küçükFont));
            document.add(new Paragraph("  • Dikkat ve sorumluluk bilincinin artırılması", küçükFont));

            document.add(new Paragraph("- Acıbadem Hastanesi, Gönüllü Stajyer (2021 Yaz)", normalFont));
            document.add(new Paragraph("  • Hasta kayıt ve yönlendirme işlemlerine destek", küçükFont));
            document.add(new Paragraph("  • Sağlık kurumları işleyişi hakkında temel bilgi edinimi", küçükFont));

            // YETENEKLER
            Paragraph yetenekler = new Paragraph("\nYetenekler", altBaslikFont);
            yetenekler.setSpacingAfter(5);
            document.add(yetenekler);

            document.add(new Paragraph("- Java, Python, SQL, C", normalFont));
            document.add(new Paragraph("- Takım Çalışması, Problem Çözme", normalFont));

            // HOBİLER
            Paragraph hobiler = new Paragraph("\nHobiler", altBaslikFont);
            hobiler.setSpacingAfter(5);
            document.add(hobiler);

            document.add(new Paragraph("- Satranç oynamak", normalFont));
            document.add(new Paragraph("- Kitap okumak", normalFont));
            document.add(new Paragraph("- Doğa yürüyüşleri", normalFont));

            // DİLLER
            Paragraph diller = new Paragraph("\nDiller", altBaslikFont);
            diller.setSpacingAfter(5);
            document.add(diller);

            document.add(new Paragraph("- İngilizce B2", normalFont));
            document.add(new Paragraph("- Almanca A1", normalFont));

            // SERTİFİKALAR
            Paragraph sertifikalar = new Paragraph("\nSertifikalar", altBaslikFont);
            sertifikalar.setSpacingAfter(5);
            document.add(sertifikalar);

            document.add(new Paragraph("- Algoritma ve Veri Yapıları İleri Seviye", küçükFont));
            document.add(new Paragraph("- Veri Modelleme", küçükFont));
            document.add(new Paragraph("- Web Sitesi Kullanılabilirliği", küçükFont));

            // REFERANSLAR
            Paragraph referanslar = new Paragraph("\nReferanslar", altBaslikFont);
            referanslar.setSpacingAfter(5);
            document.add(referanslar);

            document.add(new Paragraph("- Dr. Ayşe Yılmaz - Akademisyen, Kırklareli Üniversitesi - ayse.yilmaz@klu.edu.tr", küçükFont));

            document.close();
            System.out.println("PDF başarıyla oluşturuldu.");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Fotoğraf dosyası bulunamadı!");
        }
    }
}