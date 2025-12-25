# 🩺 Modular BMI Calculator (Java)

Bu proje, Java programlama dili ile geliştirilmiş, nesne yönelimli programlama (OOP) mantığını ve modüler mimariyi temel alan bir Vücut Kitle Endeksi (BMI) hesaplama uygulamasıdır. Kullanıcı hatalarını denetleyen ve farklı ölçüm sistemlerini destekleyen profesyonel bir yaklaşım sergiler.

---

## 🏗️ Proje Mimarisi
Proje, kodun sürdürülebilirliğini ve okunabilirliğini artırmak amacıyla üç ana modüle ayrılmıştır:

* **`BMICalculator.java` (İş Mantığı):** Hesaplama formüllerini ve BMI kategorizasyon mantığını içerir.
* **`UserInput.java` (Girdi Yönetimi):** Kullanıcıdan veri alma ve hatalı girişleri denetleme (input validation) görevlerini üstlenir.
* **`Main.java` (Koordinasyon):** Uygulamanın giriş noktasıdır; sınıflar arasındaki iletişimi yönetir.

---

## ✨ Öne Çıkan Özellikler
* **Çift Birim Desteği:** Imperial (libre/inç) ve Metric (kg/metre) sistemleri arasında dinamik geçiş.
* **Giriş Doğrulama (Input Validation):** Kullanıcı sayı yerine harf girdiğinde programın çökmesini engelleyen kontroller.
* **Modüler Yapı:** "Sorumlulukların Ayrılması" (Separation of Concerns) prensibi uygulanmıştır.

---

## 🛠️ Teknik Detaylar ve Kullanım
Uygulama, Dünya Sağlık Örgütü (WHO) standartlarını kullanır:
* **Metrik:** $BMI = \frac{kg}{m^2}$
* **Imperial:** $BMI = \frac{lb \times 703}{in^2}$

### 🚀 Nasıl Çalıştırılır?
Terminale aşağıdaki komutları sırasıyla yazarak projeyi çalıştırabilirsiniz:

```bash
# Tüm dosyaları derleyin
javac *.java

# Uygulamayı başlatın
java Main
