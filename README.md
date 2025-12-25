# 🩺 Modular BMI Calculator (Java)

Bu proje, Java programlama dili kullanılarak geliştirilmiş, nesne yönelimli programlama (OOP) prensiplerini ve modüler mimariyi temel alan bir Vücut Kitle Endeksi (BMI) hesaplama uygulamasıdır. 

---

## 🏗️ Mimari Yapı ve Encapsulation (Kapsülleme)
Bu projede kodun güvenliği ve sürdürülebilirliği için **Encapsulation** prensibi en ön planda tutulmuştur.

* **Veri Gizleme:** `BMICalculator` sınıfı içerisindeki kilo ve boy değişkenleri `private` olarak tanımlanarak dış dünyadan izole edilmiştir.
* **Kontrollü Erişim:** Verilere doğrudan erişim yerine, bu verileri işleyen ve sonuç döndüren güvenli metodlar kullanılmıştır. 
* **Sorumlulukların Ayrılması:** * `UserInput.java`: Sadece kullanıcı etkileşimi ve veri doğrulamadan sorumludur.
    * `BMICalculator.java`: Sadece matematiksel hesaplama ve iş mantığından sorumludur.
    * `Main.java`: Uygulamanın akışını koordine eder.

[Image of encapsulation in object oriented programming showing private fields and public methods]

---

## 🎓 Teknik Geçmiş ve Akademik Temeller
Bu projeyi Java ile inşa ederken, üniversite eğitimimin ilk yılında edindiğim **C, C++ ve C#** tecrübelerimi temel aldım:

* **C ile Algoritma Mantığı:** Programlamanın temeli olan algoritma kurma ve veri tiplerinin (double, float) hassas yönetimi konusundaki disiplinimi C derslerimden aldım.
* **C++ ile OOP'ye Giriş:** Nesne ve sınıf (class/object) kavramlarını ilk kez C++ ile deneyimleyerek, bu projedeki modüler yapının teorik altyapısını oluşturdum.
* **C# ile Modern Geliştirme:** C# projelerimde edindiğim syntax aşinalığı ve kullanıcı arayüzü mantığı, Java'nın yapısına hızlıca adapte olmamı sağladı.
* **Java ile Sentez:** Geçmişteki bu dillerden edindiğim "Nesne Yönelimli" düşünce yapısını, Java'nın platform bağımsız ve tip güvenli yapısıyla bu projede birleştirdim.

---

## ✨ Öne Çıkan Özellikler
* **Giriş Doğrulama (Input Validation):** Kullanıcı hatalı (sayı yerine harf vb.) giriş yaptığında programın çökmesini engelleyen `while` döngüsü ve `Scanner` kontrolleri mevcuttur.
* **Çift Birim Desteği:** Hem Metrik (kg/m) hem de Imperial (lbs/in) sistemleri üzerinden hesaplama yapılabilir.
* **Temiz Kod (Clean Code):** Okunabilirliği yüksek, yorum satırlarıyla desteklenmiş ve genişletilmeye uygun kod yapısı.

---

## 🛠️ Teknik Detaylar
Uygulama, Dünya Sağlık Örgütü (WHO) standartlarını kullanır:
* **Metrik Formül:** $BMI = \frac{kg}{m^2}$
* **Imperial Formül:** $BMI = \frac{lb \times 703}{in^2}$

### 🚀 Nasıl Çalıştırılır?
1. Depoyu klonlayın: `git clone https://github.com/nisanimsi/BMICalculator.git`
2. Terminal üzerinden tüm dosyaları derleyin:
   ```bash
   javac *.java
java Main
