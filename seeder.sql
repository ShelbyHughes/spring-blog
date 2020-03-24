# USE blog_db;
#
# insert into posts (Title, Body) values ('Programmable', 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.');
# insert into posts (Title, Body) values ('algorithm', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.
#
# Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.');
# insert into posts (Title, Body) values ('Graphical User Interface', 'Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.
#
# Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem.
#
# Fusce consequat. Nulla nisl. Nunc nisl.');
# insert into posts (Title, Body) values ('Devolved', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.');
# insert into posts (Title, Body) values ('Innovative', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.
#
# Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.');
# insert into posts (Title, Body) values ('static', 'Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.
#
# Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.
#
# Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.');
# insert into posts (Title, Body) values ('core', 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.
#
# Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.
#
# Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.');
# insert into posts (Title, Body) values ('focus group', 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.
#
# Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.
#
# Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.');
# insert into posts (Title, Body) values ('Reverse-engineered', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.
#
# In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.
#
# Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.');
# insert into posts (Title, Body) values ('foreground', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.
#
# Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.');
# insert into posts (Title, Body) values ('multimedia', 'Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst.');
# insert into posts (Title, Body) values ('internet solution', 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.');
# insert into posts (Title, Body) values ('Expanded', 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.');

DROP DATABASE blog_db;

use blog_db;

insert into users (Email, Username, Password) values ('mbum0@nature.com', 'dquinnelly0', '2IV1zkX2z');
insert into users (Email, Username, Password) values ('cmarquis1@economist.com', 'kgiacopazzi1', 'yZ9mQ4');
insert into users (Email, Username, Password) values ('erowden2@europa.eu', 'apettican2', 'MVz6mDgn');
insert into users (Email, Username, Password) values ('jcherry3@cnet.com', 'mquadri3', 'MKx4Z2TFxp0J');
insert into users (Email, Username, Password) values ('cslatcher4@php.net', 'ereuther4', 'VEGqikRiQbXw');
#
insert into posts (Body, Title, user_id) VALUES ('Body for post #1', 'Post #1', 1);
insert into posts (Body, Title, user_id) VALUES ('Body for post #2', 'Post #2', 2);
insert into posts (Body, Title, user_id) VALUES('Body for post #3', 'Post #3', 3);
insert into posts (Body, Title, user_id) VALUES ('Body for post #4', 'Post #4', 4);
insert into posts (Body, Title, user_id) VALUES ('Body for post #5', 'Post #5', 5);


# insert into users (Email, Username, Password) values ('cmirrlees5@google.es', 'msemark5', 'Rqo7cbvSv');
# insert into users (Email, Username, Password) values ('epetow6@indiegogo.com', 'gpegden6', 'HDK6b0iLg');
# insert into users (Email, Username, Password) values ('ggaymar7@netscape.com', 'ikyngdon7', 'yKLRBjlGVSu');
# insert into users (Email, Username, Password) values ('ematzaitis8@tuttocitta.it', 'esmall8', 'hje8vRqHOmZz');
# insert into users (Email, Username, Password) values ('clittlejohns9@tiny.cc', 'ggallehock9', 'klu2Pq36');
# insert into users (Email, Username, Password) values ('jnorthleya@foxnews.com', 'kpidwella', 'bBwnY3ubcXbD');
# insert into users (Email, Username, Password) values ('bchungb@tamu.edu', 'lkemberyb', 'zOAVjf');
# insert into users (Email, Username, Password) values ('ebruunc@sitemeter.com', 'edukerc', 'g7vh8vJfM9g');
# insert into users (Email, Username, Password) values ('ahubbackd@reddit.com', 'jcasswelld', 'dAec2C');
# insert into users (Email, Username, Password) values ('llanawaye@example.com', 'crosendorfe', 'K8HRBtSKcUw');
# insert into users (Email, Username, Password) values ('dlampettf@ustream.tv', 'klashbrookf', 'uemXTOr');
# insert into users (Email, Username, Password) values ('fgiovanittig@senate.gov', 'eperseg', 'gqoLt52');
# insert into users (Email, Username, Password) values ('dgillinoh@ft.com', 'ssurmeirh', 'IT3hZDpoXFC');
# insert into users (Email, Username, Password) values ('amabei@ft.com', 'psnoxilli', 'PBaAB6');
# insert into users (Email, Username, Password) values ('abohmanj@wufoo.com', 'zstopsj', 'Mu2UkD');