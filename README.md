# Mobile Apps 1 CA2

- Student Name: Lilian Moraes dos Santos
- Student ID: 24064
- Course: Bachelor Science Computing

## Requirement Checklist

- [x] 1. Movie recycler view:
    - [x] 1.1. Create a Movie class with the structure specified in movie.json (provided on Moodle)
    - [x] 1.2. Obtain and fill data (minimum of 4 movies)
        - [x] 1.2.1. Obtain relevant movie data from Vue (https://www.myvue.com/cinema/dublin/whats-on) or your favourite provider and add data credits at the bottom of the app
        - [ ] 1.2.2. Generate a random number between 0 and 15 for each movie and assign to seats_remaining
        - [ ] 1.2.3. Start with an initial default seats_selected value of 0 for all movies
        - [ ] 1.2.4. You shall fill random URLs for images from pixabay or other free image providers to begin with
    - [x] 1.3. Build a Recycler View using the specified template, refer to recycler_view_template_*.jpg (provided on Moodle)
    - [ ] 1.4. If any seats are selected, show how many seats are selected and hide remaining seats
- [ ] 2. Seat selection feature:
    - [ ] 2.1. Clicking any item (anywhere on the item) on the movie recycler view should open a new MovieActivity, refer to movie_activity_*.jpg (provided on Moodle)
    - [ ] 2.2. Add plus and minus icons, show seats_selected in the middle
    - [ ] 2.3. On click plus/minus, update both seats_selected and seats_remaining for that movie
    - [ ] 2.4. Add validation, when 0 seats selected minus is disabled, when 0 seats remaining plus is disabled
    - [ ] 2.5. When back is pressed, the selected seats are retained and reflected in the recycler view. (Hint: If you don’t see any updates, call adapter notifyItemChanged as soon as you return to the recycler view activity)
- [ ] 3. Bonus:
    - [ ] 3.1. Add "filling fast" badge if less than 3 seats remaining
    - [ ] 3.2. Use "Roboto Condensed" font to replicate same style
    - [ ] 3.3. Use original movie images from myvue.com or your favourite provider (Hint: check get_movie_image_url.gif (provided on Moodle))

## Report

The development of the Mobile Apps project has been a challenging experience for the project developer. Several difficulties were encountered and, despite several attempts, it was not possible to complete all stages. The main obstacle was the complexity of using the Android Studio tool, which required significant learning to operate correctly.
Despite the challenges faced, it was only possible to significantly advance in the third attempt with the help of online classes the creation of RecyclerView, which is a vital component in the development of mobile applications.
Despite the hard work and dedication to the project, an error was identified that I was unable to correct. Unfortunately, this issue made it impossible to see the application running on the emulator.
I believe that design is crucial in mobile app development and as such more learning and practice time is needed.
In conclusion, the development of the Mobile Apps project encountered several obstacles that hindered its implementation. The complexity of using the Android Studio tool and the need for more time to learn and practice contributed to the difficulties of the project. Despite the setbacks faced, the lessons learned from this experience will be useful in future mobile application development projects.

Screenshot recording
[Link](https://dorsetdemo-my.sharepoint.com/:v:/g/personal/24064_student_dorset-college_ie/EVnLAeDUo-BPi0FUEQxk5bcBtrcyBRdWbQ2kidt8bBN9aw?e=RVAcgC)

[device-2023-04-17-114551.webm](https://github.com/lilimoraes/MobileApp_Movie/assets/108881413/665aeac1-220c-44fb-a14a-fae8d3a561bb)

https://dorsetdemo-my.sharepoint.com/:v:/g/personal/24064_student_dorset-college_ie/EVnLAeDUo-BPi0FUEQxk5bcBtrcyBRdWbQ2kidt8bBN9aw

![image](https://github.com/lilimoraes/MobileApp_Movie/assets/108881413/eae32b2b-6eb2-43c3-ac1e-944e0ec45c4c)


## References and Credits

1. Android Studio - Criando uma Lista de Produtos com RecyclerView. URL: [Link](https://www.youtube.com/watch?v=UT4b6mWeL4A)

