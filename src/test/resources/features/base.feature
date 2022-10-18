@automation
Feature: automation test
  Scenario: cycle one
    Given I login on the page Evalart
      |user|password|
      |473166   |10df2f32286b7120Mi00LTY2MTM3NA==30e0c83e6c29f1c3|
    When I complete the first form
      |t_rex|date      |
      |17   |07/02/2023|
    And I complete the second form
      |sharks|operation2|text_s|
      |18    |53915     |S     |
    And I complete the third form
      |operation|date      |
      |-41526   |12/02/2023|
    And I complete the fourth form
      |text_c|operation|
      |C     |-100320  |
    And I complete the fifth form
      |text_b|operation|date      |
      |B     |15526    |28/06/2022|
    And I complete the sixth form
      |operation|date      |t_rex|
      |-572488  |20/11/2022|8    |
    And I complete the seventh form
      |operation|date      |text_y|
      |18829    |17/09/2022|y     |
    And I complete the eighth form
      |animal|date      |
      |8     |14/12/2022|
    And I complete the ninth form
      |operation|date      |animal|
      |-775572  |18/09/2022|10    |
    And I complete the tenth form
      |animal|text_H|
      |8     |H     |
    Then I should see the text "Felicidades, has terminado la prueba exitosamente"
