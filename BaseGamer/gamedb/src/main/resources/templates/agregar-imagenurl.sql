ALTER TABLE videojuegos ADD COLUMN imagenurl VARCHAR(255);

UPDATE videojuegos
SET imagenurl = CASE nombre
    WHEN '1Xtreme' THEN 'https://www.covercentury.com/index.php?p=psx&l=1&f=1xtreme-NTSC-PSX-FRONT1.jpg'
    WHEN '2Xtreme' THEN 'https://www.covercentury.com/index.php?p=psx&l=1&f=2xtreme-NTSC-PSX-FRONT.jpg'
    WHEN '3D Baseball' THEN 'https://www.covercentury.com/index.php?p=psx&l=1&f=3DBaseball-NTSC-PSX-FRONT.jpg'
    WHEN '3D Lemmings' THEN 'https://www.covercentury.com/index.php?p=psx&l=1&f=3DLemmings-PAL-PSX-FRONT.jpg'
    WHEN '3Xtreme' THEN 'https://www.covercentury.com/index.php?p=psx&l=1&f=3xtreme-NTSC-PSX-FRONT.jpg'
    -- Añade aquí las URLs de los demás juegos según vayas obteniendo las imágenes
    ELSE NULL
END