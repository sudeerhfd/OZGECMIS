# OZGECMIS
# Java ile PDF Özgeçmiş Oluşturma

Bu proje, **Java** programlama dili ve **iText** kütüphanesi kullanılarak kişisel bir özgeçmişin (CV) PDF formatında otomatik olarak oluşturulmasını sağlar.

## Özellikler

- Kişisel bilgiler, iletişim, adres, doğum tarihi ve yeri
- Eğitim geçmişi
- İş deneyimleri
- Yetenekler
- Hobiler
- Yabancı diller
- Sertifikalar
- Referanslar
- Kariyer hedefi
- Fotoğraf desteği (özgeçmişe fotoğraf ekleyebilme)
- Türkçe karakter desteği (Arial font gömülerek)
- Çok sayfalı PDF çıktısı

## Kullanılan Teknolojiler

- Java (JDK 8+ önerilir)
- [iText](https://itextpdf.com/en) PDF kütüphanesi

## Kurulum ve Kullanım

1. **Projeyi indir veya klonla:**
    ```bash
    git clone https://github.com/sudeerhfd/ozgecmis-pdf-java.git
    cd ozgecmis-pdf-java
    ```

2. **Gerekli iText kütüphanesini ekle:**
    - Maven kullanıyorsan, `pom.xml` dosyasına şu bağımlılığı ekle:
      ```xml
      <dependency>
          <groupId>com.itextpdf</groupId>
          <artifactId>itextpdf</artifactId>
          <version>5.5.13.3</version>
      </dependency>
      ```
    - Manuel kullanıyorsan, [iText JAR dosyasını](https://search.maven.org/artifact/com.itextpdf/itextpdf/5.5.13.3/jar) indirip projenin lib klasörüne ekle.

3. **Fotoğrafını proje klasörüne `foto.jpg` olarak ekle.**

4. **Kodu derle ve çalıştır:**
    ```bash
    javac ozgecmis.java
    java ozgecmis
    ```
    Program çalıştığında "ozgecmis.pdf" adında bir PDF dosyası oluşacaktır.

## Özelleştirme

- Kişisel bilgileri, eğitim ve iş deneyimlerini, kariyer hedefini ve diğer bölümleri kendi bilgilerinle düzenleyebilirsin.
- Fotoğraf dosyasını değiştirmek için proje klasöründeki `foto.jpg` dosyasını yenisiyle değiştir.
- Font veya tasarım üzerinde değişiklikler yapmak için kodun başındaki font ayarlarını düzenleyebilirsin.

## Ekran Görüntüsü

> (Buraya özgeçmiş PDF’inden bir ekran görüntüsü ekleyebilirsin)

## Lisans

Bu proje MIT lisansı ile lisanslanmıştır.

---

**Hazırlayan:** [Sude Naz Çolak](https://github.com/sudeerhfd)
