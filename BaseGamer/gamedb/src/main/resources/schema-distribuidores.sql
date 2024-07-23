-- Crear la tabla distribuidores
CREATE TABLE distribuidores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    telefono VARCHAR(20),
    email VARCHAR(255),
    sitio_web VARCHAR(255)
);

-- Insertar 40 distribuidores
INSERT INTO distribuidores (nombre, direccion, telefono, email, sitio_web) VALUES
('Nintendo', '11-1 Kamitoba Hokotate-cho, Minami-ku, Kyoto, 601-8501, Japón', '+81 75-662-9600', 'info@nintendo.co.jp', 'https://www.nintendo.co.jp'),
('Sony Interactive Entertainment', '2207 Bridgepointe Parkway, San Mateo, CA 94404, USA', '+1 650-655-8000', 'support@playstation.com', 'https://www.playstation.com'),
('Microsoft Xbox', 'One Microsoft Way, Redmond, WA 98052, USA', '+1 425-882-8080', 'support@microsoft.com', 'https://www.xbox.com'),
('Ubisoft', '28 Rue Armand Carrel, 93100 Montreuil, Francia', '+33 1 48 18 50 00', 'contact@ubisoft.com', 'https://www.ubisoft.com'),
('Electronic Arts', '209 Redwood Shores Parkway, Redwood City, CA 94065, USA', '+1 650-628-1500', 'support@ea.com', 'https://www.ea.com'),
('Activision Blizzard', '3100 Ocean Park Blvd, Santa Monica, CA 90405, USA', '+1 310-255-2000', 'contact@activisionblizzard.com', 'https://www.activisionblizzard.com'),
('Take-Two Interactive', '622 Broadway, New York, NY 10012, USA', '+1 646-536-2842', 'info@take2games.com', 'https://www.take2games.com'),
('Bandai Namco Entertainment', '1-4-1, Takada, Nishi-ku, Osaka 550-0004, Japón', '+81 6-6265-9000', 'info@bandainamco.com', 'https://www.bandainamcoent.com'),
('Square Enix', '6-27-30 Shinjuku, Shinjuku-ku, Tokio 160-8430, Japón', '+81 3-5299-8100', 'contact@square-enix.com', 'https://www.square-enix.com'),
('Sega', '1-2, Takadanobaba, Toshima-ku, Tokio 169-0075, Japón', '+81 3-5739-6611', 'info@sega.co.jp', 'https://www.sega.com'),
('Capcom', '3-1-3, Hirano, Chuo-ku, Osaka 540-0032, Japón', '+81 6-6260-4343', 'contact@capcom.com', 'https://www.capcom.com'),
('Konami', '1-1, Chuo-ku, Tokio 104-8223, Japón', '+81 3-5771-5000', 'info@konami.com', 'https://www.konami.com'),
('THQ Nordic', 'Schmiedgasse 16, 5020 Salzburg, Austria', '+43 662-871444', 'info@thqnordic.com', 'https://www.thqnordic.com'),
('2K Games', '2K Games, 2K Drive, Novato, CA 94945, USA', '+1 415-507-7000', 'support@2k.com', 'https://www.2k.com'),
('Bethesda Softworks', 'Bethesda, MD 20814, USA', '+1 301-926-8300', 'info@bethsoft.com', 'https://bethesda.net'),
('Warner Bros. Interactive Entertainment', '4000 Warner Blvd, Burbank, CA 91522, USA', '+1 818-954-6000', 'contact@warnerbros.com', 'https://www.wbgames.com'),
('Riot Games', '12333 W. Olympic Blvd, Los Angeles, CA 90064, USA', '+1 310-420-0200', 'support@riotgames.com', 'https://www.riotgames.com'),
('CD Projekt Red', 'Jagiellońska 74, 03-301 Warszawa, Polonia', '+48 22 228 34 00', 'contact@cdprojekt.com', 'https://www.cdprojekt.com'),
('Paradox Interactive', 'Sveavägen 34, 111 34 Estocolmo, Suecia', '+46 8-402-51-00', 'info@paradoxplaza.com', 'https://www.paradoxinteractive.com'),
('Devolver Digital', '6121 S. Congress Ave, Suite D, Austin, TX 78745, USA', '+1 512-476-9400', 'contact@devolverdigital.com', 'https://www.devolverdigital.com'),
('Humble Bundle', '3605 W. 6th St, Suite 407, Los Angeles, CA 90020, USA', '+1 323-848-0704', 'support@humblebundle.com', 'https://www.humblebundle.com'),
('Focus Entertainment', '22 Rue de la Baume, 69006 Lyon, Francia', '+33 4 72 69 82 00', 'contact@focus-entmt.com', 'https://www.focus-entmt.com'),
('Koch Media', 'Edelweißstraße 8, 82041 Oberhaching, Alemania', '+49 89 613 80 00', 'info@kochmedia.com', 'https://www.kochmedia.com'),
('Nacon', '100 Boulevard du Parc, 92500 Rueil-Malmaison, Francia', '+33 1 84 15 20 10', 'contact@nacon.fr', 'https://www.nacongaming.com'),
('Team17', 'Level 3, 6-7 Citadel Place, Tinworth Street, London SE11 5EF, UK', '+44 20 7385 3500', 'info@team17.com', 'https://www.team17.com'),
('GOG.com', 'Rondo ONZ 1, 00-124 Warszawa, Polonia', '+48 22 882 10 40', 'contact@gog.com', 'https://www.gog.com'),
('Zenimax Media', '1370 Piccard Dr, Rockville, MD 20850, USA', '+1 301-840-0400', 'info@zenimax.com', 'https://www.zenimax.com'),
('NetEase Games', '6F, Tower B, NetEase Building, No. 199, Wangshang Road, Hangzhou, China', '+86 571-8601-3200', 'support@netease.com', 'https://www.neteasegames.com'),
('Smilegate', '1109, 11th Floor, 200, Gwangnaru-ro, Seongdong-gu, Seoul, Corea del Sur', '+82 2-3480-0700', 'contact@smilegate.com', 'https://www.smilegate.com'),
('Bluehole Studio', 'Jincheon-gun, Chungcheongbuk-do, Corea del Sur', '+82 43-285-8400', 'contact@bluehole.net', 'https://www.bluehole.net'),
('Pearl Abyss', 'Gwanghwamun Office Tower, 4F, 91-9, Gwanghwamun-ro, Jongno-gu, Seúl, Corea del Sur', '+82 2-3440-0100', 'contact@pearlabyss.com', 'https://www.pearlabyss.com'),
('DONTNOD Entertainment', '34 Rue des Petits Champs, 75001 París, Francia', '+33 1 55 35 00 00', 'contact@dont-nod.com', 'https://www.dont-nod.com'),
('Gust', '2-5-5, Nishiki, Naka-ku, Nagoya, Aichi 460-0003, Japón', '+81 52-219-7888', 'info@gust.co.jp', 'https://www.gust.co.jp'),
('Level-5', '1-6-2, Shinjuku, Shinjuku-ku, Tokio 160-0022, Japón', '+81 3-6380-0600', 'info@level5.co.jp', 'https://www.level5.co.jp'),
('Arc System Works', '1-2, Moto-Machi, Chuo-ku, Kobe 650-0024, Japón', '+81 78-327-0614', 'info@arcsystemworks.jp', 'https://www.arcsystemworks.jp'),
('Team17', 'Level 3, 6-7 Citadel Place, Tinworth Street, London SE11 5EF, UK', '+44 20 7385 3500', 'info@team17.com', 'https://www.team17.com');

